package com.crm.qa.testdata;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExceldata {	
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;

		public ReadExceldata( String excelpath)
		{
			
		try 
		{
			File src = new File(excelpath);
			
			FileInputStream fis = new FileInputStream (src);
			
			 wb = new XSSFWorkbook(fis);
			
			 sheet1 = wb.getSheetAt(0);
		} 
		 catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		}
		
		
		public String getData (int sheetnumber,int rownumber,int column)
		{
			String data = sheet1.getRow(rownumber).getCell(column).getStringCellValue();
			return data;
		}


		

	}




		


