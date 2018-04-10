import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopUpTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.name("proceed")).click();
		
				Alert alert = driver.switchTo().alert();
				
				System.out.println(alert.getText());
				
				alert.accept(); //it will click on Ok 
				
				//alert.dismiss(); //to click on cancel button

	}

}
