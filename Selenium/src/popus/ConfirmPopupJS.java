package popus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPopupJS
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert alt = driver.switchTo().alert();
		String cnfMsg = alt.getText();
		System.out.println(cnfMsg);
		Thread.sleep(2000);
		alt.dismiss();
		alt.accept();
		Thread.sleep(2000);
		String cnfMsg1 = alt.getText();
		System.out.println(cnfMsg1);
		alt.accept();
		
	}

}