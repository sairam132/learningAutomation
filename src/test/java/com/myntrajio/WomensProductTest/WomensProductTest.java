package com.myntrajio.WomensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.Listenerimplementation.class)

public class WomensProductTest {
	@Test(groups= {"FT","RT"})
	public void addwoproduct() {
		Reporter.log(" women product added  suscess",true);
	}
	@Test(groups= {"IT","RT"})
	public void removewoproduct() {
		Reporter.log(" women product added suscess",true);
	}
	@Test(groups= {"ST","RT"})
	public void updatewoproduct() {
		Reporter.log(" women product updated  suscess",true);
	}
}
