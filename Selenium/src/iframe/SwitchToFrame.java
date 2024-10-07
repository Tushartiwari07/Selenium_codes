package iframe;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		  driver.get("https://www.dream11.com/");
//		  driver.switchTo().frame(0); //IT IS USED TO SWITCH TO THE IFRAME BASED ON THEIR INDEX VALUE
//		  driver.switchTo().frame("send-sms-iframe");//IT IS USED TO SWITCHTO THE IFRAME BASED ON Id or Name
		 WebElement fElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		 driver.switchTo().frame(fElement);
		  driver.findElement(By.id("regEmail")).sendKeys("9065456");
		  driver.findElement(By.id("regUser")).click();
		  WebElement errMsg = driver.findElement(By.id("errorMob"));
		  System.out.println(errMsg.getText());
		  driver.switchTo().defaultContent();
		  driver.findElement(By.id("hamburger")).click();
		  driver.findElement(By.id("//a[text()='Dream11 Team Today']")).click();
		
	}
}
