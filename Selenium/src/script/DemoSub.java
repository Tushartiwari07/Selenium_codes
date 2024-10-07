package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSub 
{
	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     driver.findElement(By.id("newsletter-subscribe-button")).click();
	     WebElement msg = driver.findElement(By.id("newsletter-result-block"));
//	     WebElement msg = driver.findElement(By.xpath("//div[text()='Enter valid email']"));
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    System.out.println(wait.until(ExpectedConditions.visibilityOf(msg)).getText());
//	     
	     wait.until(ExpectedConditions.visibilityOf(msg));
	     
	     System.out.println(msg.getText());	
	     
	     
	}
}
