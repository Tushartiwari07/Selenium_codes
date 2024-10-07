package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoginXpath {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tushar");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("tushar");
		driver.findElement(By.xpath("//input[value='Log in']")).click();

	}
}
