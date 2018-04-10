package FirefoxScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstFFExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.learn-automation.com");
		System.out.println (driver.getTitle());
		

	}

}
