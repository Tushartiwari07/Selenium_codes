package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("before sending data");
		System.out.println(loginButton.isDisplayed());//check weather element is present or not
		System.out.println(loginButton.isEnabled());//checks weather elements is enabled
		
		driver.findElement(By.name("username")).sendKeys("tushar_123");
		driver.findElement(By.name("password")).sendKeys("tushar_123");
		
		System.out.println("after sending data");
		System.out.println(loginButton.isDisplayed());//check weather element is present or not
		System.out.println(loginButton.isEnabled());//checks weather elements is enabled
		
	
		
		
	}

}
