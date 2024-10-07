package popus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modals 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://the-internet.herokuapp.com/entry_ad");
//			
//		driver.findElement(By.id("restart-ad")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//p[text()='Close']")).click();
		driver.get("https://www.woodenstreet.com/?");
		driver.findElement(By.id("loginclose1")).click();
		
		
	}

}
