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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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

	@Parameters({ "browser", "username" })
	@BeforeClass
	public void browserSetup(String bname, String username) {
	
		
		System.out.println("Username:" + username);

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
		// Create Object For All Library
		createObject();
		
		// Configure the SparkReport Information
		spark.config().setDocumentTitle("Regresstion Testing For the RegisterPage");
		spark.config().setReportName("RegresstionSuite");
		spark.config().setTheme(Theme.DARK);

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in Extent Report
		report.setSystemInfo("DeviceName:", "Harry");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-128.0.6613.85 ");

		Reporter.log("precondition Done Sucessful", true);

	}

	@AfterTest
	public void postcondition() {
		// Flush the Report Information
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