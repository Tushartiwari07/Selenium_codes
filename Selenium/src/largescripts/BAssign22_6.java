package largescripts;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BAssign22_6 
{
	public static void main(String[] args) throws InterruptedException
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://www.shoppersstack.com/");
	   driver.findElement(By.xpath("//span[text()='PONDs Bright Beauty Serum Cream Anti S...']")).click();
//	   Thread.sleep(2000);
	  WebElement compare = driver.findElement(By.xpath("//button[@id='compare']"));
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.elementToBeClickable(compare));
	  compare.click();
	   Set<String> wid = driver.getWindowHandles();
	  for(String handle:wid)
	  {
		  String title = driver.switchTo().window(handle).getTitle();

		  if(title.contains("eBay"))
			{
				System.out.println(title);
//				   driver.manage().window().maximize();
				break;	   
			}
	  }
	   driver.manage().window().setSize(new Dimension(150, 150));
	   driver.manage().window().setPosition(new Point(700, 300));
	}

}


//if(title.contains("amazon"))
//{
//driver.close();
//}
//if(title.contains("flipkart"))
//{
//	  driver.close();
//}
