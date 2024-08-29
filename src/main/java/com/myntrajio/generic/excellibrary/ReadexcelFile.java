package com.myntrajio.generic.excellibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import com.myntrajio.generic.common.FrameworkConstant;


public class ReadexcelFile implements FrameworkConstant  {
	 public FileInputStream fis =null;
	 public FileOutputStream fos=null;
	 public Workbook wb=null;
	
	 public String readData(String sheet, int row, int column)
	 {
		// Step 1: Convert physical file to java readable object By using
			// FileInputStream Class
			try {
				fis = new FileInputStream(excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Step 2: Open the workbook BY Creating WB-Factory
			 try {
				wb = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Step3:Fetch the Data---->Optimized Code
			String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

			//print on console
			System.out.println(data);
			
			// Step4:Close the workbook
			try {
				wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
return data;
			
		
		}
	 
	 public void writeData(String sheet, int row, int column, Date data)
	 {
		// Step 1: Convert physical file to java readable object By using FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			// Step 2: Open the workbook BY Creating WB-Factory
			try {
				wb = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
			//To Write the Data 
			wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);
			
			//convert data From Java type to Physical File
			 try {
				fos = new FileOutputStream(excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Write the Excel
			try {
				wb.write(fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Close the workbook
			try {
				wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Exceution Completed");

		}
	 
	 
	 public void displayData(String sheet, int row, int column)
	 {
		// Step 1: Convert physical file to java readable object By using
					// FileInputStream Class
					try {
						fis = new FileInputStream(excelpath);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// Step 2: Open the workbook BY Creating WB-Factory
					 try {
						wb = WorkbookFactory.create(fis);
					} catch (EncryptedDocumentException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// Step3:Fetch the Data---->Optimized Code
					String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

					//print on console
					System.out.println(data);
					
					// Step4:Close the workbook
					try {
						wb.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	System.out.println(data);
 
	 }
	 
	 
	 
	 public void readMutipleData(String sheet, int row, int column)
	 {
		// Step 1: Convert physical file to java readable object By using
			// FileInputStream Class
			 try {
				fis = new FileInputStream(excelpath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Step 2: Open the workbook BY Creating WB-Factory
			 try {
				wb = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//How To Fetch Multiple Data
			
			//Fetch The Last Row Count
			int count = wb.getSheet(sheet).getLastRowNum();
			
			// Fetch data  of one Students Details --->
			for (int i = 0; i <5 ; i++) 
			{
				String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
				System.out.println(data);
			}
			
			//  Close the workbook
			try {
				wb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	
	 }
	 

	
	 