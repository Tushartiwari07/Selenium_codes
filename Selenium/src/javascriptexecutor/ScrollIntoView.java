package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement latestCourses = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", latestCourses);//True will scroll the webpage area upto the element touch the top of viewport
		
//		js.executeScript("arguments[0].scrollIntoView(false)", latestCourses);//false will scroll the webpage area upto the element touch the buttom of viewport

	}

}
