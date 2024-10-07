package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.name("username")).sendKeys("tushar_tushar55");
		driver.findElement(By.name("password")).sendKeys("1525665161");
		

	}

}
