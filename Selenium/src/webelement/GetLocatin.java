package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocatin 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point location = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();//Used tp get the lOCATION of the elements
		System.out.println(location);
		System.out.println("X co-ordinates of search "+ location.getX());
		System.out.println("y co-ordinates of search "+ location.getY());
		
		
		Point vote = driver.findElement(By.xpath("//input[@id='vote-poll-1']")).getLocation();
		System.out.println(vote);
		System.out.println("X co-ordinates of vote "+ vote.getX());
		System.out.println("y co-ordinates of vote "+ vote.getY());
		
		
		

		
		
		
		
	}

}
