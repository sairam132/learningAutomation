package com.myntrajio.generic.common;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest extends ObjectLibrary {

	@BeforeMethod
	public void login() {
		Reporter.log("login Sucessful", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout Sucessful", true);

	}

	//@Parameters({ "browser", "username" })
	@Parameters("browser")
	@BeforeClass
//	public void browserSetup(String bname, String username)
	public void browserSetup(String bname)
	{
		test=report.createTest(bname);
	//	System.out.println("Username:"+username);

		// Create Object For All Library
		createObject();

		// Step 1:Launch the Browser
		webdriverlibrary.launchBrowser(bname);

		// Fetch Url Data from property-File
		String URL = propertyfilelibrary.readData("url");

		// Step2:Maximize the Browser
		webdriverlibrary.maximizeBrowser();

		// Step3:Navigate to the Application via URL
		webdriverlibrary.navigateToApp(URL);

		Reporter.log("BrowserSetup: " + bname + " Sucessful", true);
	}

	@AfterClass
	public void closebrowser() {
		// Close The Browser
		webdriverlibrary.closeWindow();
		Reporter.log("Closebrowser Sucessful", true);

	}

	@BeforeTest
	public void precondition() {
		//Create Object for all library
		createObject();
		// configure the sparkReport information
		spark.config().setDocumentTitle("Regression Testing for the registerpage");
		spark.config().setReportName("RegressionSuite");
		spark.config().setTheme(Theme.DARK);
		
		//Attach the spark Report and Extend report
		report.attachReporter(spark);
		
		// configure the system information in the Extent report
		report.setSystemInfo("DeviceName","ram");
		report.setSystemInfo("OperatingSystem","WINDOWS10");
		report.setSystemInfo("Browser","chrome");
		report.setSystemInfo("BrowserVersion","chrome-128.06613.85");
		
		Reporter.log("precondition Done Sucessful", true);

	}

	@AfterTest
	public void postcondition() {
		
		//Flush the report information
		report.flush();
		Reporter.log("postcondition Done Sucessful", true);

	}

	@BeforeSuite
	public void getSuiteConnections() {
		Reporter.log("Get SuiteConnections Done Sucessful", true);
	}

	@AfterSuite
	public void terminateSuiteconnection() {
		Reporter.log("Terminate Suiteconnection Done Sucessful", true);

	}
}