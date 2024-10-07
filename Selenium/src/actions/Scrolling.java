package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.get("https://demoapp.skillrary.com/");
	     WebElement carrer = driver.findElement(By.linkText("Career"));
	     Actions act=new Actions(driver);
//	     act.scrollToElement(carrer).perform();
	     act.scrollByAmount(0, 500).perform();
	     
		
	}

}
