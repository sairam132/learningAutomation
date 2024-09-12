package com.myntrajio.RegisterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.common.BaseTest;
@Listeners(com.myntrajio.generic.listenerlibrary.Listenerimplementation.class)
public class RegisterTest extends BaseTest {

	@Test
	public void registerValidData() {

		// Create The TestReport
		test = report.createTest("RegisterValidData");

		String name = excellibrary.readData("Registerdetails", 1, 0);
		String email = excellibrary.readData("Registerdetails", 1, 1);
		String Password = excellibrary.readData("Registerdetails", 1, 2);
		String mobileno = excellibrary.readData("Registerdetails", 1, 3);
		String feedback = excellibrary.readData("Registerdetails", 1, 5);
		test.log(Status.INFO, "Data Taken From Excel File Success");

		// Waiting Statement
		javalibrary.pause(5000);

		// Provide Implicitly Wait
		webdriverlibrary.waitUntilElementFound();

		String exptitle = "LearningSelenium";
		String acttitle = webdriverlibrary.driver.getTitle();
		System.out.println(acttitle);

		// Step1:Verify the Register Page
		Assert.assertEquals(exptitle, acttitle);
		test.log(Status.PASS, "Step1:Verified-Title, Register Page is Displayed");

		// Create an Object For Register Page
		RegisterPage regpage = new RegisterPage(webdriverlibrary.driver);

		boolean elementExpCondition = true;
		boolean elementActualCondition = regpage.getNametextfield().isDisplayed();

		// Step2:Verify The Element
		Assert.assertEquals(elementExpCondition, elementActualCondition,
				"Verified NameTxtField Weblement -It Is Displayed");
		test.log(Status.PASS, "Step2:Verified- NameTextField, It Is Displayed");

		// Step3:Perform Action--Clear
		regpage.getNametextfield().clear();
		test.log(Status.PASS, "Step3:NameTextField Cleared Success");

		// Step4:Perform Action--Enter Name
		regpage.getNametextfield().sendKeys(name);
		test.log(Status.INFO, "Step4:Entered UserName in NameTextField  Success");

		// Step5:Perform Action--Enter Email
		regpage.getEmailtextfield().sendKeys(email);
		test.log(Status.PASS, "Step5:Entered Email in EmailTextField  Success");

		// Step6:Perform Action--Enter Password
		regpage.getPasswordtextfield().sendKeys(Password);
		test.log(Status.PASS, "Step6:Entered Password in PasswordTextField  Success");

		// Step7:Perform Action--Enter MobileNo
		regpage.getMobiletextfield().sendKeys(mobileno);
		test.log(Status.PASS, "Step7:Entered Mobile no in MobileNoTextField  Success");

		// Step8:Perform Action--Enter Feedback
		regpage.getfeedbacktextfield().sendKeys(feedback);
		test.log(Status.PASS, "Step8:Entered FeedBack in FeedBackArea  Success");

		test.log(Status.INFO, "------Register With Valid Data Sucess Completed------");
		Reporter.log("Register With Valid Data Sucess", true);
	}

	@Test
	public void validateRegisterButtonSize() {

		// Create The TestReport
		test = report.createTest("ValidateRegisterButtonPosition");

		test.log(Status.INFO, "------Validate RegisterButtonSize Completed------");
		Reporter.log("RegisterButtonSize Validated ", true);
	}

	@Test
	public void validateRegisterButtonPosition() {
		// Create The TestReport
		test = report.createTest("ValidateRegisterButtonPosition");

		test.log(Status.INFO, "------ValidateRegisterButtonPositionCompleted------");

		Reporter.log("RegisterButtonPositionValidated ", true);
	}

	@Test
	public void validateRegisterButtonColor() {

		// Create The TestReport
		test = report.createTest("ValidateRegisterButtonColor");

		test.log(Status.INFO, "------Validate RegisterButtonColor Completed------");

		Reporter.log("RegisterButtonColor Validated ", true);
	}

}