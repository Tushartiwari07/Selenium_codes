package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspDemo
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(parentFrame);
		driver.switchTo().frame(0);

		WebElement nestedFrame = driver.findElement(By.id("email"));
//		driver.switchTo().frame(nestedFrame);
		nestedFrame.sendKeys("tiwaritushar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("tush123445");
		driver.findElement(By.xpath("//span[@class='passwordEye']")).click();
		driver.findElement(By.id("confirm-password")).sendKeys("tush123445");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//section[@class='poppins text-[15px]']")).clear();
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();

		
		
		
		
		
		
		
		
	}

}
