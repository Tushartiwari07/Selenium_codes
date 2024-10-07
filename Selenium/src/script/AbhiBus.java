package script;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
//		while(true)
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//span[text()='October']/../../..//span[text()='15']")).click();
				break;	
			}
			catch (Exception e) 
			{
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
			}
		}	
	}
}
//(//div[@class=\"input-prefix col auto\"])[3]