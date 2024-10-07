package script;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
public class YonoBusiness
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.get("https://yonobusiness.sbi/");
	     driver.findElement(By.partialLinkText("LOGIN")).click();
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("test@134");
	     WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
	     Actions act= new Actions(driver);
	     act.moveToElement(eyeIcon).clickAndHold().perform();
	     
	     File temp = password.getScreenshotAs(OutputType.FILE);
	     File dest = new File("./ScreenShots/password.png");
	     FileHandler.copy(temp, dest);
	     
	     Thread.sleep(5000);
	     act.release(eyeIcon).perform();
		
	}

}
