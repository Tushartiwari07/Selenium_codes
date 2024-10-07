package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	     WebElement imgFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	     driver.switchTo().frame(imgFrame);
	     WebElement img = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	     WebElement gallery = driver.findElement(By.id("gallery"));
	     WebElement trash = driver.findElement(By.id("trash"));
	     WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	     WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	     WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	     Actions act = new Actions(driver);
	     act.dragAndDrop(img, trash).perform();
	     act.dragAndDrop(img2, trash).perform();
	     act.dragAndDrop(img3, trash).perform();
	     act.dragAndDrop(img4, trash).perform();
	     Thread.sleep(3000);
	     act.dragAndDrop(img,gallery).perform(); 
	     act.dragAndDrop(img2,gallery).perform(); 	
	     act.dragAndDrop(img3,gallery).perform(); 	
	     act.dragAndDrop(img4,gallery).perform(); 	
	     

	     


	     
		
	}

}
