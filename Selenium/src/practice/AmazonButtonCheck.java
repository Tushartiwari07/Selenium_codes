package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonButtonCheck
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		driver.get("https://demoapp.skillrary.com/");
//		List<WebElement> allButtons = driver.findElements(By.tagName("button"));
//		System.out.println("Number of buttons "+allButtons.size());
//		List<WebElement> allimg = driver.findElements(By.tagName("img"));
//		System.out.println("Number of images "+allimg.size());
//		List<WebElement> allLink = driver.findElements(By.tagName("a"));
//		System.out.println("Number of links "+ allLink.size());
        driver.findElement(By.name("field-keywords")).sendKeys("Iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.className("a-link-normal _bXVsd_link_36_Co")).click();
        
	}

}
