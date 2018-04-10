package MyFirstSeleniumScript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTestLogin {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:\\www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Muktaa");
	
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).sendKeys("Sharma");
		
		//driver.findElement(By.xpath(".//*[@id='u_0_q']")).sendKeys("123456789");
		
		
		
		driver.findElement(By.xpath(".//*button[@id='u_0_13']")).click();
		
		
		
		driver.quit();
		
		
		
		
		
		System.out.println(driver.getTitle());

	}

}
