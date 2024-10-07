package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TVS
{
	@Test(groups = "system")
	public void launchYamaha()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tvsmotor.com/tvs-xl100/tvs-xl100-heavy-duty");
		Reporter.log("TVS launched successfully",true);
	}


}
