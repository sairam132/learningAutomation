package com.myntrajio.generic.propertyfilelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Reporter;
import com.myntrajio.generic.common.FrameworkConstant;

public class ReadPropertyfile implements FrameworkConstant {
	FileInputStream fis=null;
	FileOutputStream fos=null;
	Properties property=null;

	public String readData(String key) {

		// 1.Converting physical File into Java Understandable Using FileInputStream
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2.create an object for properties class
		property = new Properties();

		// 3.load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Fetch the data-By calling getProperty()
		String data = property.getProperty(key);

		return data;
	}

	public void writeData(String key, String value) {
		// enter the data
		property.put(key, value);

		// create instance for FileOutputStream Class
		try {
			fos = new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// store the Data
		try {
			property.store(fos, "Updated the New Key-value Sucessfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void displayData(String key) {

		// Converting physical File into Java Understandable Using FileInputStream
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// create an object for properties class
		property = new Properties();

		// load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Fetch the data-By calling getProperty()
		String data = property.getProperty(key);

		// Display the Data
		Reporter.log(key + " : " + data, true);
	}

}