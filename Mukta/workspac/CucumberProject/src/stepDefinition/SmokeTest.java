package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	
	
	
	@Given("^Open Firefox and start application$")
	public void Open_Firefox_and_start_application() throws Throwable {
	  
		driver= new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com");
	   
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
	   
	}

	@Then("^User should be logged in successfully$")
	public void User_should_be_logged_in_successfully() throws Throwable {
	 
	}

}
