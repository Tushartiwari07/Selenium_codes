package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspDemoMultipleIframe
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement signUp = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(signUp);
		driver.findElement(By.id("email")).sendKeys("tushartiwari@gmail.com");
		driver.findElement(By.id("password")).sendKeys("tusjskbb");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("tushar");
		
	}

}
