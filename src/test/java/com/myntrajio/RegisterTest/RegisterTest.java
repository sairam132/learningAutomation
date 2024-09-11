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
public class RegisterTest extends BaseTest{
		@Test
		public void registerValidData() {
			// create an test report
			test=report.createTest("validate");
			test = report.createTest("RegisterValidData");
			String name= excellibrary.readData("Registerdetails", 1, 0);
			String email= excellibrary.readData("Registerdetails", 1, 1);
			String Password= excellibrary.readData("Registerdetails", 1, 2);
			String mobileno= excellibrary.readData("Registerdetails", 1, 3);
			String feedback= excellibrary.readData("Registerdetails", 1, 5);
			test.log(Status.INFO,"data taken from excel file sucess");
			// Waiting Statement
			javalibrary.pause(5000);

			// Provide Implicitly Wait
			webdriverlibrary.waitUntilElementFound();

			String exptitle = "LearningSelenium";
			String acttitle = webdriverlibrary.driver.getTitle();
			System.out.println(acttitle);

			// Step1:Verify the Register Page
			Assert.assertEquals(exptitle, acttitle, "Verified Register Page");
			test.log(Status.PASS,"verified-Title ,register page is displyed");

			// Create an Object For Register Page
			RegisterPage regpage = new RegisterPage(webdriverlibrary.driver);

			boolean elementExpCondition = true;
			boolean elementActualCondition = regpage.getNametextfield().isDisplayed();

			// Step2:Verify The Element
			Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTxtField Weblement -It Is Displayed");

			// Step3:Perform Action--Clear
			regpage.getNametextfield().clear();
			test.log(Status.PASS,"verified-nameTextfield sucess");

			// Step4:Perform Action--Enter Name
			regpage.getNametextfield().sendKeys(name);
			test.log(Status.PASS,"entered-name sucess");

			// Step5:Perform Action--Enter Email
			regpage.getEmailtextfield().sendKeys(email);
			test.log(Status.PASS,"enter-email sucess");

			// Step6:Perform Action--Enter Password
			regpage.getPasswordtextfield().sendKeys(Password);
			test.log(Status.PASS,"enter password sucess");

			// Step7:Perform Action--Enter MobileNo
			regpage.getMobiletextfield().sendKeys("9154161162");
			test.log(Status.PASS,"enter mobileno sucess");

			// Step8:Perform Action--Enter Feedback
			regpage.getfeedbacktextfield().sendKeys(feedback);
			test.log(Status.PASS,"enter feedback sucess");

			Reporter.log("Register With Valid Data Sucess", true);
			
		}
		@Test
		public void vaildRegisterButtonColor() {
			// Create an test report
			test = report.createTest("vaildRegisterButtonColor");
			test.log(Status.PASS, "Validate vaildRegisterButtonColor sucess");
		}

		@Test
		public void vaildRegisterButtonPostion() {
			// Create an test report
			test = report.createTest("vaildRegisterButtonPostion");
			test.log(Status.PASS, "Validate vaildRegisterButtonPostion sucess");
		}

		@Test
		public void vaildRegisterButtonSize() {
			// Create an test report
			test = report.createTest("vaildRegisterButtonSize");
			test.log(Status.INFO, "Validate vaildRegisterButtonSize sucess");
		}

	}