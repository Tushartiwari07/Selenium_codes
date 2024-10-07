package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		c1.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
	    c1.findElement(By.name("username")).sendKeys("tiwari_tushar55");
//	    Thread.sleep(2000);
	    c1.findElement(By.name("password")).sendKeys("8073396567@2927");
	    Thread.sleep(1000);
	    c1.findElement(By.xpath("//div[text()='Log in']")).click();
	    c1.findElement(By.xpath("//span[text()='Reels']"));
	  //span[text()='Reels']
//	    Thread.sleep(2000);
//	         Set<String> wid = c1.getWindowHandles();
//	         for(String handle:wid)
//	         {
//	        	 String url = c1.switchTo().window(handle).getCurrentUrl();
//	        	 if(url.contains("https://www.instagram.com/accounts"))
//	        	 {
//	        		 c1.findElement(By.xpath("//span[text()='Reels']"));
//	       
////             		    c1.findElement(By.xpath("//span[text()='More']")).click();
////	        		    Thread.sleep(2000);
////	        		    c1.findElement(By.xpath("//span[text()='Log out']")).click();
//	        	 }
//	
//	         }

	}	
}
