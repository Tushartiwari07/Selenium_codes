package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class VtiggerAssigh
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		 WebElement x = driver.findElement(By.xpath("//input[@id='username']"));
         WebElement y = driver.findElement(By.xpath("//input[@id='password']"));
         x.clear();
         y.clear();
         x.sendKeys("Tushar@");
         y.sendKeys("bxbbk4551");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temSS = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/Vtiger111.png");
		FileHandler.copy(temSS, dest);
	}

}
