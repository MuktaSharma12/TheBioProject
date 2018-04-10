package seleniumTests_bioagency;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bioagency_testngclass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:\\www.thebioagency.com");
	}
	
	@Test(priority=1)
	public void Verifytitle_HomePage(){
		String actualtitle=driver.getTitle();
		System.out.println("Title of the page is  "+actualtitle);
		String expectedtitle = "Digital Transformation &amp; Innovation Agency - The Bio Agency";
	//	Assert.assertEquals(MyPage_title, expected_title);
		if (expectedtitle.equals(actualtitle))
		{
		System.out.println("Verification Successful - The correct title is displayed on the web page.Test case is Passed");
		}
		else
		{
		System.out.println("Verification Failed - An incorrect title is displayed on the web page. The test case is failed");
		}
		
	}
	
	@Test(priority=3)
	public void VerifySidePanel() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https:\\www.thebioagency.com");
		driver.findElement(By.xpath("//a[text()='Digital Innovation']")).click();
		System.out.println("Digital Innovation page is displayed");
		
		driver.findElement(By.xpath("//a[text()='Digital Transformation']")).click();
		System.out.println("Digital Transformation page is displayed");
		
		driver.findElement(By.xpath("//a[text()='Our Work']")).click();
		System.out.println("People images are displayed");
		
		driver.findElement(By.xpath("//a[text()='Our People']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//a[text()='News & Views']"));
		element.click();
		
		Actions action = new Actions(driver);
	    action.moveToElement(element).moveToElement(driver.findElement(By.partialLinkText("In The"))).click().build().perform();
	    Thread.sleep(4000);
	    System.out.println("In the press page is displayed");
	    
	    
	   WebElement element1= driver.findElement(By.xpath("//a[@class='Menu-item color-magenta'][contains(text(),'Blog')]"));
	   	element1.click();
	   	Thread.sleep(3000);
	   
	  WebElement element2= driver.findElement(By.partialLinkText("Get In"));
	  element2.click();
	  System.out.println("This test method is verified");
	       
	   	}
	
	
	@Test(priority=2)
	public void VerifytheLogo_HomePage(){
		Boolean img = driver.findElement(By.xpath("//a[@class='Sidebar-logo icon icon-logo_new']")).isDisplayed();
		System.out.println("The logo is available: "+img );
	}
	
	
	@Test(priority=4)
	public void CountnumberofLinks_HomePage(){
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("The page has total number of links: " +links.size());
		for(WebElement ele:links)
			System.out.println(ele.getAttribute("href"));
	}
			
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
