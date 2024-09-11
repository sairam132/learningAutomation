package com.myntrajio.generic.common;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.myntrajio.generic.excellibrary.ReadexcelFile;
import com.myntrajio.generic.javalibrary.javaLibrary;
import com.myntrajio.generic.propertyfilelibrary.ReadPropertyfile;
import com.myntrajio.generic.webdriverlibrary.WebdriverLibrary;

public class ObjectLibrary  implements FrameworkConstant{
	public ReadexcelFile excellibrary;
	 public javaLibrary 	  javalibrary;
	 public ReadPropertyfile  propertyfilelibrary;
	 public WebdriverLibrary webdriverlibrary   ;
	 public ExtentSparkReporter spark;
	 public ExtentReports report;
	 public ExtentTest test;
	 
	public void createObject() {
	   excellibrary =new ReadexcelFile();
		  javalibrary=new javaLibrary();
		  propertyfilelibrary=new ReadPropertyfile();
		  webdriverlibrary=new WebdriverLibrary();
		  
		  // create the spark report
		   spark= new ExtentSparkReporter(reportpath);
		   
		   // create the extend report
		   report = new ExtentReports() ;
		
		   
		 
	}

}
