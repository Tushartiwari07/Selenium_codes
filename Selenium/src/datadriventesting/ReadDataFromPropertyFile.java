package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReadDataFromPropertyFile
{
	public static void main(String[] args) throws IOException 
	{
		//step 1: Create FileInputStream object 
		FileInputStream fs=new FileInputStream("./TestData/CommonData.properties");
		
		//Step 2: Create respective file type object
		Properties prop=new Properties();
		
		//step 3: call read Methods
		prop.load(fs);
		String URL = prop.getProperty("url");
		String Email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
//		System.out.println(URL+"  " +Email+" "+pwd);
		
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	   driver.get(URL);
//	   driver.findElement(By.id("Email")).sendKeys(Email);
//	   driver.findElement(By.id("Password")).sendKeys(pwd);
//	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();
	   
	   
	   driver.get(URL);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Email);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

}
