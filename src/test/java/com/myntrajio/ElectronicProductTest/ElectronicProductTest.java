package com.myntrajio.ElectronicProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.myntrajio.generic.listenerlibrary.Listenerimplementation.class)
public class ElectronicProductTest {
	@Test(groups= {"FT","RT"})
	public void addproduct() {
		Reporter.log("product added Electronicsuscess",true);
	}
	@Test(groups= {"IT","RT"})
	public void removeproduct() {
		Reporter.log("product added Electronic suscess",true);
	}
	@Test(groups= {"ST","RT"})
	public void updateproduct() {
		Reporter.log("product updated Electronic suscess",true);
	}

}
