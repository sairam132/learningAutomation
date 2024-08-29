package com.myntrajio.generic.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		//initialize the page 
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="name")
	 private WebElement nametextfield;
	
	@FindBy(id="email")
	 private WebElement emailtextfield;
	@FindBy(id="password")
	 private WebElement passwordtextfield;
	@FindBy(id="mobile")
	 private WebElement mobiletextfield; 
	public WebElement getNametextfield() {
		return nametextfield;
	}
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	public WebElement getMobiletextfield() {
		return mobiletextfield;
	}
	

}


