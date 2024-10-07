package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		Dimension size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();//Used tp get the size of the elements
		Dimension size1 = driver.findElement(By.xpath("//input[@id='small-searchterms']")).getSize();
		System.out.println(size1);
		System.out.println("Height of the element  "+ size1.getHeight());
		System.out.println("Width of the element  "+ size1.getWidth());
	
	}

}
