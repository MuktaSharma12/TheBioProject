package MyFirstSeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFacebookdropdown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:\\www.facebook.com");
		
		driver.manage().window().maximize();
		
		

	}

}
