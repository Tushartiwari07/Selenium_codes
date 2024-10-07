package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot11 
{
	public static void main(String[] args) throws IOException 
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.primevideo.com/storefront/ref=atv_hm_hom_c_9zZ8D2_hm_tv?contentType=tv&contentId=home");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/AMZimagesSS"+time+".png");
		FileHandler.copy(temp, dest);	
		
	}

}
