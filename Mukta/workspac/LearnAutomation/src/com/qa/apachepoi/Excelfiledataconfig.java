package com.qa.apachepoi;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfiledataconfig {	
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;

		public Excelfiledataconfig( String excelpath)
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



