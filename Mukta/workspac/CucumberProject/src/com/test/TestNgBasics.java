package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
 
	
	//pre-conditions - starting with @Before
	
	@BeforeSuite //1
	public void setUp(){
		System.out.println("setup system property for chrome");
	}
	
	
		
	@BeforeClass //3
	public void login(){
		System.out.println("please login to the app");
	}
	
	
	/*
	 * @BeforeMethod
	 * @Test - test case 1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test - test case - 2
	 * @AfterMethod
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	@BeforeMethod //4
	public void enterURL(){
		System.out.println("enter the url");
	}
	
	@BeforeTest //2
	public void launchBrowser(){
		System.out.println("launch the Browser");
	}
	
	
	//test cases -starts with @Test
	
	//5
	@Test(priority=1,groups="GooglePage") 
	public void googleTitleTest(){
		//String title =driver.getTitle();
		System.out.println("google title test");
	}
	
	@Test(priority=2,groups="SearchPage")
	public void searchTest(){
		System.out.println("Search the test");
	}
	
	
	
	@Test(priority=3,groups="GooglePage")
	public void test1(){
		System.out.println(" test 1 is running");
		
	}
	
	@Test(priority=4)
	public void test2(){
		System.out.println("test2 is running");
	}
	
	
	//post conditions-starting with @after
	
	@AfterMethod		//6
	public void logout(){
		System.out.println("logout from app");
	}
	
	@AfterTest //8
	public void deleteallcookies(){
		System.out.println("delete allcookies");
	}
	
	
	@AfterClass //7
	public void closeBrowser(){
		System.out.println("close the browser");
	}
	
	
	
	
}
	
	
	
	

	
	
	
	
	
	
	
	
	
	