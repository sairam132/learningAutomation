package com.myntrajio.generic.common;

import com.myntrajio.generic.excellibrary.ReadexcelFile;
import com.myntrajio.generic.javalibrary.javaLibrary;
import com.myntrajio.generic.propertyfilelibrary.ReadPropertyfile;
import com.myntrajio.generic.webdriverlibrary.WebdriverLibrary;

public class ObjectLibrary {
	public ReadexcelFile excellibrary;
	 public javaLibrary 	  javalibrary;
	 public ReadPropertyfile  propertyfilelibrary;
	 public WebdriverLibrary webdriverlibrary   ;
	 
	public void createObject() {
	   excellibrary =new ReadexcelFile();
		  javalibrary=new javaLibrary();
		  propertyfilelibrary=new ReadPropertyfile();
		  webdriverlibrary=new WebdriverLibrary();
		 
	}

}
