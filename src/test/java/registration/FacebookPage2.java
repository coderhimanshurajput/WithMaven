package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FacebookPage2 {
	
	@Test
		
	public void TC001() {
	System.setProperty("webdriver.chrome.driver", "./BrowserDriver/ChromeDriver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.facebook.com");
	WebElement username = driver.findElement(By.xpath(".//*[@id='email']"));
	username.sendKeys("hihihihihi");
	
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("hiihihi");
	driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
//	Actions builder = new Actions(driver);
	
	}
}
