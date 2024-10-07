package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegAssign 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Tushar");
		driver.findElement(By.name("LastName")).sendKeys("Tiwari");
		driver.findElement(By.name("Email")).sendKeys("tiwaritushar@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Tushar@2927");
		driver.findElement(By.name("FirstName")).sendKeys("Tushar@2927");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Tushar@2927");
		driver.findElement(By.name("register-button")).click();
	 	
	}

}
