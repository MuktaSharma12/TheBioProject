package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	
	@Test
	public void logintest(){
		System.out.println("login test");
		//int i =9/0;
	}
	
	
		@Test(dependsOnMethods="logintest")
	public void HomePagetest(){
		System.out.println("HomePage test");
	}
	
	
		@Test(dependsOnMethods="logintest")
		public void SearchPagetest(){
			System.out.println("SearchPage test");
		}
		
		@Test(dependsOnMethods="logintest")
		public void RegistrationPagetest(){
			System.out.println("RegistrationPage test");
		}
		
	
	
	
	
	
}
