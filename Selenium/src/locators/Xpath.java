package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		//---------XPATH BY ATTRIBUTE--------------
		
		
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		//---------XPATH BY TEXT()----------------
//		if we dont have any attributes we go for this method
//		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
//		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
	
//		//------------XPATH BY CONTAINS()
//		
//		  //
//		  driver.findElement(By.xpath("//input[contains(@class,'search-box-text ')]")).
//		  sendKeys("books");
//		  
//		  // driver.get("https://www.instagram.com/"); // Thread.sleep(2000); //
//		  driver.manage().window().maximize(); // Actions act=new Actions(driver); //
//		  act.scrollByAmount(0, 500).perform(); // driver.findElement(By.
//		  xpath("//span[contains(text(),'Contact uploading and non-users')]")).click();
//		  driver.get("https://demowebshop.tricentis.com/");
//		
//        driver.findElement(By.xpath("//a[contains(text(),'Recently')]")).click();   

		//------------XPATH BY DEPENDENT & INDEPENDENT----------------
//	     driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])/../..//input[contains(@value,'Add to cart')]")).click();
	     driver.findElement(By.xpath("//label[text()='Poor']/../..//input[@value='3']")).click();
		
        
		
	}

}
