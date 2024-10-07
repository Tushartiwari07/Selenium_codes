package popus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Thread.sleep(3000);
//		while(true)
//		{
//		  try
//		  {
//		  	driver.findElement(By.xpath("//div[text()='December 2024']/../..//div[@aria-label='Fri Dec 06 2024']")).click();
//		  	break;
//		  }
//		  catch (Exception e) 
//		  {
//		 	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click(); 
//		  }
//	   }
		String month="October";
		int date=1;
		int year=2024;
		
		for(;;)
		{
			  try
			  {
//			  	driver.findElement(By.xpath("//div[text()='December 2024']/../..//div[@aria-label='Fri Dec 06 2024']")).click();
				  driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
			  	break;
			  }
			  catch (Exception e) 
			  {
			 	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			  }
			  
			
		}
	
		
		
//		driver.findElement(By.xpath("//div[text()='July']/../..//p[text()='15']")).click();
//		driver.findElement(By.xpath("//div[text()='July 2024']/../..//p[text()='15']")).click();

	
	  
	}

}
