package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID 
{
	public static void main(String[] args) 
	{ 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("tushartiwari@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8102069961596");
		
		
	}
	

}
