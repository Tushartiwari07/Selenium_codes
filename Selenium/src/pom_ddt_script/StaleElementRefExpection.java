package pom_ddt_script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import demoskillary.WelcomePageSkillary;

public class StaleElementRefExpection
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demoapp.skillrary.com/");
		 WebElement searchTextField = driver.findElement(By.id("navbar-search-input"));
		 searchTextField.sendKeys("ManualTesting",Keys.ENTER);
		 Thread.sleep(3000);
		 WebElement searchTextField1 = driver.findElement(By.id("navbar-search-input"));
		 searchTextField1.sendKeys("AutomationTesting",Keys.ENTER);
		 
//		 WelcomePageSkillary ds=new WelcomePageSkillary(driver);
//		 ds.getSearchTextFeild().sendKeys("ManualTesting",Keys.ENTER);
//		 Thread.sleep(3000);
//		 ds.getSearchTextFeild().sendKeys("AutomationTesting",Keys.ENTER);

		 
	}

}
