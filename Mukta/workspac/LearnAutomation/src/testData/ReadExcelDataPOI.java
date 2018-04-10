package testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDataPOI {
	
	
	
	@Test
	public void ExcelData() throws Exception{
		
		String excelpath= ("C:\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(excelpath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//rowcount
		
		int rowNum =sheet.getLastRowNum();
		
		//columncount
		
		int colNum=	sheet.getRow(0).getLastCellNum();
		
		String [][] data = new String[rowNum][colNum];
		
		for(int i =0;i<rowNum;i++){
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<colNum;j++){
				XSSFCell cell = row.getCell(j);
				String value = cell.toString();
				
				data[i][j]=value;
				System.out.println("the value is "+value);
				
			}
		}
		workbook.close();
	}
	
}
				
				
				
				
				
			
			
		
	
		
		
		
		
	


