package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByoffSet
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.get("https://yonobusiness.sbi/");
	     driver.findElement(By.partialLinkText("LOGIN")).click();
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("test@134");
	     Actions act = new Actions(driver);
	     act.moveByOffset(1296, 315).clickAndHold().perform();
	     Thread.sleep(2000);
	     act.release();
	     
	}

}
