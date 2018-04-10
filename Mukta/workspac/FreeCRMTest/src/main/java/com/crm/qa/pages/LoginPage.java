package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
  //we have to define page factory or O.R 
	
	@FindBy(name="username")
	WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginButton;
	
	@FindBy(xpath= "//button[contains(text(),'Sign Up')]")
			WebElement SignUpButton;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement CRMLogo;
	
	
	
	
	//Initializing the page objects
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	
		
	public boolean validateCRMImage(){
		return CRMLogo.isDisplayed();
	}
	
	
	public HomePage Login(String un,String pwd){
	username.sendKeys(un);
	password.sendKeys(pwd);
	LoginButton.submit();
	
	return new HomePage();
	
}
	
}
