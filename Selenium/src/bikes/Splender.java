package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Splender 
{
	@Test(groups = "system")
	public void launchSuzuki()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in/motorcycles/practical/splendor-plus.html");
		Reporter.log("Splender launched successfully",true);
	}


}
