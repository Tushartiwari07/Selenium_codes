package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ninja 
{
	@Test(groups = "smoke")
	public void launchNinja()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://kawasaki-india.com/bikes/ninja-300/");
		Reporter.log("Ninja launched successfully",true);
	}

}
