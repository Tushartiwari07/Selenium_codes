
package script;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopUpCnfBox 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement jsframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(jsframe);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		WebElement Cmsg = driver.findElement(By.id("demo"));
		System.out.println(Cmsg.getText());
	}

}
