package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String text = driver.findElement(By.xpath("//span[@id='subscribe-loading-progress']")).getText();
		System.out.println(text);
		
		
	}

}
