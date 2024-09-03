package com.myntrajio.RegisterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.common.BaseTest;
@Listeners(com.myntrajio.generic.listenerlibrary.Listenerimplementation.class)
public class RegisterTest extends BaseTest{
		@Test
		public void registerValidData() {
			String name= excellibrary.readData("Registerdetails", 1, 0);
			String email= excellibrary.readData("Registerdetails", 1, 1);
			String Password= excellibrary.readData("Registerdetails", 1, 2);
			String mobileno= excellibrary.readData("Registerdetails", 1, 3);
			String feedback= excellibrary.readData("Registerdetails", 1, 5);
			//Wating statement
       javalibrary.pause(5000);
       
       // provide implicit wait
       webdriverlibrary.waitUntilElementFound(0);
       String exptitle="LearningSelenium";
       String actitle=webdriverlibrary.driver.getTitle();
       System.out.println(actitle);
       
			// Step 1 :: Verify the RegisterPage
			Assert.assertEquals(exptitle, actitle, "Verified Register PAge");
			
		 	// Step 3 :: Creating an Object for Register Page
			RegisterPage regpage= new RegisterPage(webdriverlibrary.driver);
			
			boolean elementExpCondition=true;
			boolean elementActualCondition=regpage.getNametextfield().isDisplayed();
			
			// Step 2 :: Verify the Element
			Assert.assertEquals("elementexpCondition", "elementActualCondition", "Verified  NameTxtField Webelement -it is displayed");

			// Step 4 :: Perform Action -- Clear
			regpage.getNametextfield().clear();
			// Step 5 :: Perform Action -- enter Name text field
			regpage.getNametextfield().sendKeys(name);
			// Step 6 :: Perform Action -- Enter Email text field
			regpage.getEmailtextfield().sendKeys(email);
			// Step 7 :: Perform Action-- Enter PassWord text field
			regpage.getPasswordtextfield().sendKeys(Password);
			// Step 9 :: Perform Action-- Enter mobile text field
			regpage.getMobiletextfield().sendKeys(mobileno);
			// step10 :: perform Action --enter feedback in text field
			regpage.getfeedbacktextfield().sendKeys(feedback);

			Reporter.log("Register with valid Data Sucess", true);
		}
	}




