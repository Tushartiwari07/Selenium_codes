package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Instragram 
{
	@DataProvider
	public String[][] instaLoginData()
	{
		String[][] data= {
				{"tushar","tiwari"},
				{"koresh","patil"},
				{"aditya","kanthi"}
		}; 
		return data;
	}
	
//	@Test(dataProvider = "instaLoginData")
	@Test(dataProviderClass = DataStorage.class,dataProvider = "loginData")
	public void instaLogin(String[] loginData)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(loginData[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(loginData[1]);
		
	}

}
