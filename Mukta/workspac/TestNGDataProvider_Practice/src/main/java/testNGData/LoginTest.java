package testNGData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.util.TestUtil;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C://Selenium Drivers//chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		//System.out.println(driver.getTitle());
		
	}
	
	@DataProvider
	public Object[][] getLoginData(){
		
		Object data [][] = TestUtil.getTestData("login");
		return data;
	}
	
	
	@Test(dataProvider="getLoginData")
	public void loginTest(String username, String password){
		driver.findElement(By.xpath("//input[@name='username' and @type = 'text']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password' and @type = 'password']")).sendKeys(password);

		// login button:
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
