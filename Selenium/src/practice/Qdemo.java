package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qdemo 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("tushar123");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tushar123@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tushar123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Register']")).click();

	
		

		
	}

}
