package largescripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaDownloads 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.id("java8-doc-download")).click();
		switchToWindow(driver, "javase-jdk8-doc-downloads.html");
		driver.findElement(By.linkText("javafx-8u411-apidocs.zip")).click();
		WebElement javafxdwn = driver.findElement(By.linkText("Download javafx-8u411-apidocs.zip"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", javafxdwn);
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShots/SorryMsg.png");
		FileHandler.copy(temp, dest);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='icn-close w11close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Java SE Development Kit 8 Documentation License Agreement']")).click();
		switchToWindow(driver, "licenses/javase8speclicense.html");
		WebElement ltdLicense = driver.findElement(By.xpath("//strong[text()=' LIMITED LICENSE GRANTS']"));
		System.out.println(ltdLicense.getText());
		WebElement disclaimer = driver.findElement(By.xpath("//strong[text()=' DISCLAIMER OF WARRANTIES']"));
		System.out.println(disclaimer.getText());
		WebElement ltdLiability = driver.findElement(By.xpath("//strong[text()=' LIMITATION OF LIABILITY']"));
		System.out.println(ltdLiability.getText());
		WebElement restrictedRights = driver.findElement(By.xpath("//strong[text()=' RESTRICTED RIGHTS LEGEND']"));
		System.out.println(restrictedRights.getText());
		WebElement report = driver.findElement(By.xpath("//strong[text()=' REPORT']"));
	    System.out.println(report.getText());
	    WebElement general = driver.findElement(By.xpath("//strong[text()=' GENERAL TERMS']"));
	    System.out.println(general.getText());
	    Thread.sleep(2000);
	    driver.quit();
	}
	public static void switchToWindow(WebDriver driver,String expUrl)
	{
		Set<String> childIds = driver.getWindowHandles();
		for(String id:childIds)
		{
			String url = driver.switchTo().window(id).getCurrentUrl();
			if(url.contains(expUrl))
			{
			  break;
			}	
	    }
	}

}
