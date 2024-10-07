package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		  driver.get("https://www.dream11.com/");
		  driver.switchTo().frame(0); 
		  driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9065456654");
		  driver.findElement(By.id("regUser")).click();
		  WebElement errMsg = driver.findElement(By.id("errorMob"));
		  System.out.println(errMsg.getText());
		
	}

}
