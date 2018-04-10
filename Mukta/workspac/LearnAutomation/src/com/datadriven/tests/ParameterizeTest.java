package com.datadriven.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.ebay.com");
		System.out.println (driver.getTitle());
		WebElement abc= driver.findElement(By.xpath("//a[contains(text(),'register')]"));
		abc.click();
		
		//get data from excel
	
			Xls_Reader reader = new Xls_Reader( "C:\\ExcelData\\EbayTestData.xlsx");
			 int rowCount = reader.getRowCount("Regtestdata");
			//String obj1 = reader.getCellData("Regtestdata", "firstname", 2);
			
	//Parameterization
	for(int rowNum=2; rowNum<=rowCount; rowNum++){
		
			System.out.println("---------------------");
			String firstname = reader.getCellData("Regtestdata", "firstname", rowNum);
			System.out.println(firstname);
			
			String lastname=reader.getCellData("Regtestdata", "lastname", rowNum);
			System.out.println(lastname);
			
			String emailaddress=reader.getCellData("Regtestdata", "emailaddress", rowNum);
			System.out.println(emailaddress);
			
			String password=reader.getCellData("Regtestdata", "password", rowNum);
			System.out.println(password);
			
			driver.findElement(By.id("firstname")).clear();
			driver.findElement(By.id("firstname")).sendKeys(firstname);
			

			driver.findElement(By.xpath("//input[@id='lastname']")).clear();
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
			

			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);
			

			driver.findElement(By.xpath("//input[@id='PASSWORD']")).clear();
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys(password);
			}
		}

	}


