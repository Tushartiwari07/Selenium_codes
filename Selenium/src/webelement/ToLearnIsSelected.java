package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected 

{

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.xpath("//option[@value='90']"));
		System.out.println(price.isSelected());
		price.click();
		System.out.println("After clicking---------");
		System.out.println(price.isSelected()); 
		
	}

}
