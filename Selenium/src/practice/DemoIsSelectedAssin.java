package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIsSelectedAssin
{

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement vote = driver.findElement(By.xpath("//label[text()='Excellent']/../..//input[@id='pollanswers-1']"));
//      WebElement vote = driver.findElement(By.xpath("//input[@value='1']"));
		System.out.println(vote.isSelected());
		vote.click();
		System.out.println("After clicking");
		System.out.println(vote.isSelected());
	}

	}


