package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[] args) 
	{
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.get("https://demowebshop.tricentis.com/");
	     Actions act=new Actions(driver);
//	     act.contextClick().perform();// It is used to perform rightClick action on the webPage
	    WebElement cart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
	    act.contextClick(cart).perform();// It is used to perform rightClick action on the WebElement
		
	}

}
