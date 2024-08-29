package com.myntrajio.KidsProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.Listenerimplementation.class)
public class KidsProductTest {
	@Test(groups= {"FT","RT"})
	public void addKidsproduct() {
		Reporter.log(" kid product added suscess",true);
	}
	@Test(groups= {"IT","RT"})
	public void removeKidsproduct() {
		Reporter.log(" kid product added suscess",true);
	}
	@Test(groups= {"ST","RT"})
	public void updateKidsproduct() {
		Reporter.log(" kid product updated suscess",true);
	}
}
