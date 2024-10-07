package script;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class VTigerAssign
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
	    driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		Thread.sleep(2000);
		Set<String> wid = driver.getWindowHandles();
		
		for(String handle:wid)
		{
			String url = driver.switchTo().window(handle).getCurrentUrl();
			if(url.contains("https://www.vtiger.com/"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Tush@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8079Tush");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./ScreenShots/VtigerInnerLogin.png");
        FileHandler.copy(temp, dest);
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parent);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement un = driver.findElement(By.id("username"));
		WebElement pw = driver.findElement(By.id("password"));
		un.clear();
		pw.clear();
		un.sendKeys("Tushar");
		pw.sendKeys("Tush123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String color = driver.findElement(By.xpath("//span[@id='validationMessage']")).getCssValue("color");
		System.out.println(color);
		Thread.sleep(1000);
		File temp1 = driver.findElement(By.xpath("//span[@id='validationMessage']")).getScreenshotAs(OutputType.FILE);
		File dest1= new File("./ScreenShots/VtigermainLogin.png");
		FileHandler.copy(temp1, dest1);
		
			
		
	}

}
