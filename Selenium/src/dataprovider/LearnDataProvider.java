package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider
{
	@DataProvider
	public String[][] dataSender()
	{
		String[][] data= {
				{"admin","admin"},
				{"user","user"},
				{"tushar","tiwari"},
				{"abcd","wxyz"}
				
		};
		return data;
	}
	@Test(dataProvider = "dataSender")
	public void login(String [] loginData)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys(loginData[0]);
		driver.findElement(By.id("password")).sendKeys(loginData[1]);
		
	}

}
