package cars;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mahindra 
{
	@Test(groups = "smoke")
	public void launchMahindra()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://auto.mahindra.com/suv/thar/THRN.html");
		Reporter.log("Mahindra launched successfully",true);
	
	}
}
