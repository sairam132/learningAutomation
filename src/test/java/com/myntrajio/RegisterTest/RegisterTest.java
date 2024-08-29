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
       javalibrary.pause(5000);
			// Step 1 :: Verify the RegisterPage
			Assert.assertEquals("title", "title", "Verified Register PAge");
			// Step 2 :: Verify the Element
			Assert.assertEquals("element", "element", "Verified Webelement");
			// Step 3 :: Creating an Object for Register Page
			RegisterPage regpage= new RegisterPage(webdriverlibrary.driver);
			// Step 4 :: Perform Action -- Clear
			regpage.getNametextfield().clear();
			// Step 5 :: Perform Action -- enter Name text field
			regpage.getNametextfield().sendKeys("admin");
			// Step 6 :: Perform Action -- Enter Email text field
			regpage.getEmailtextfield().sendKeys("admin123@gmail.com");
			// Step 7 :: Perform Action-- Enter PassWord text field
			regpage.getPasswordtextfield().sendKeys("admin123@#");
			// Step 9 :: Perform Action-- Enter mobile text field
			regpage.getMobiletextfield().sendKeys("9876543210");

			Reporter.log("Register with valid Data Sucess", true);
		}
	}




