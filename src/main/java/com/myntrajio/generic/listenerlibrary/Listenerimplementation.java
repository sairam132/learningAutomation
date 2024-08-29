package com.myntrajio.generic.listenerlibrary;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.myntrajio.generic.common.BaseTest;

public class Listenerimplementation extends BaseTest implements ITestListener {
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Reporter.log("Taking Screenshot start:" + name, true);

		// convert driver type into takescreenshot type(Type casting)
		TakesScreenshot ts = (TakesScreenshot) webdriverlibrary.static_driver;

		// Take the screenshot and store it in temp file
		File tempfile = ts.getScreenshotAs(OutputType.FILE);

		// create a file to save image format
		File destfile = new File("./src/test/resources/screenshot/" + name + ".png");

		// copy the file from tempfile to destfile
		try {
			FileHandler.copy(tempfile, destfile);
		}

		catch (Exception e) {
		}
		Reporter.log("Taking screenshot completed :" + name, true);

	}
}
