package com.myntrajio.MensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.generic.listenerlibrary.Listenerimplementation.class)

public class MensProductTest {
	@Test(groups= {"FT","RT"})
	public void addMensproduct() {
		Reporter.log(" men product  added suscess",true);
	}
	@Test(groups= {"IT","RT"})
	public void removeMensproduct() {
		Reporter.log(" men product  added suscess",true);
	}
	@Test(groups= {"ST","RT"})
	public void updateMensproduct() {
		Reporter.log("men product  updated suscess",true);
	}
}
