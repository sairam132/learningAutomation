
package com.myntrajio.generic.javalibrary;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class javaLibrary {
	public String getCurrentTime() {
		Date date=new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
	}
	/**
	 * this method generates random number within  the specified limit
	 * @param limit
	 * @return
	 */
	public  int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
		
	}
	public void pause(int i) {
		// TODO Auto-generated method stub
		
	}
	 
		 
	 }


