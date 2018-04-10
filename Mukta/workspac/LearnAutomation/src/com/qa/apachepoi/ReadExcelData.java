package com.qa.apachepoi;

public class ReadExcelData {

	public static void main(String[] args) {
	
		Excelfiledataconfig obj1 = new Excelfiledataconfig("C:\\ExcelData\\TestData.xlsx");
		 
		System.out.println(obj1.getData(0, 0, 1));
		

	}

}
