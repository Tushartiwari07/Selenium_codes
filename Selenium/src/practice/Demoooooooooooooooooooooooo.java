package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demoooooooooooooooooooooooo
{
	@Test
	public void login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("tushar");
		driver.findElement(By.id("Password")).sendKeys("tushar");

		
	}

}
