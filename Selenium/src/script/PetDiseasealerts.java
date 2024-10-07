package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetDiseasealerts 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		 WebElement mapframe = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		 driver.switchTo().frame(mapframe);
		 WebElement montana = driver.findElement(By.id("region-27")); 
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.elementToBeClickable(montana));
		  montana.click();
		  driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		 driver.findElement(By.id("user")).sendKeys("tushartiwari@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("Tushar@123");
		 driver.findElement(By.id("cpass")).sendKeys("Tushar@123");

		 driver.findElement(By.id("firstName")).sendKeys("Tushar");
		 driver.findElement(By.id("lastName")).sendKeys("Tiwari");
		 driver.findElement(By.id("phone")).sendKeys("8073396567");
		 WebElement listbox = driver.findElement(By.id("user-type"));
		 Select sl=new Select(listbox);
		 sl.selectByValue("3");
		 
		 WebElement clickButton = driver.findElement(By.xpath("//input[@id='accept-tou']"));
//		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//		  wait1.until(ExpectedConditions.elementToBeClickable(clickButton));
		 Thread.sleep(3000);
		  clickButton.click();
		 driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
//		 Thread.sleep(5000);

//		 WebElement cnfMsg = driver.findElement(By.xpath("//b[text()='Thank you for registering!']"));
//		 System.out.println(cnfMsg.getText());



		 
	
	
	
//	https://petdiseasealerts.org/forecast-map/#/
		
	}

}
