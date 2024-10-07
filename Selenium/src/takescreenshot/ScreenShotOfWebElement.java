package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;    
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebElement 
{
	public static void main(String[] args) throws IOException 
	{
		//TimeStamp
		//calling Now method if LocalDateTime.now()&@OverridingToSting()&callReplace();
		 String time = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/Demo"+time+".png");
		FileHandler.copy(temp, dest);
		
		
		
	}

}
