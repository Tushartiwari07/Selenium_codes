package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.accessibility.model.AXNodeId;

public class DemoQsp
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
 //		th[text()='SAMSUNG Galaxy']/following-sibling::td[3]
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(3000);
		String discount = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
		System.out.println(discount);
		String Txt = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']")).getText();
		System.out.println(Txt);
		String Tag = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']")).getTagName();
		System.out.println(Tag);
//        driver.get("https://demowebshop.tricentis.com/login");
//        driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		String color = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
//		System.out.println(color);


	}
}
