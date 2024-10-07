package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSkillaryAssin
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
	    driver.findElement(By.linkText("LOGIN")).click();
	    driver.findElement(By.name("email")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("admin");
	    driver.findElement(By.name("login")).click();	
	    String CurrentUrl = driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	    
	}

}
