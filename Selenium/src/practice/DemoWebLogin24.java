package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebLogin24 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value=\"Add to cart\"]")).click();
		WebElement cnfMsg = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[text()='The product has been added to your ']")));
		wait.until(ExpectedConditions.invisibilityOfAllElements(cnfMsg));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		
	}

}
