package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FreshersWorld 
{
	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\vmahi\\OneDrive\\Desktop\\OOPs\\Selenium\\Resume\\Tushar_resume.pdf");		
		
	}

}
