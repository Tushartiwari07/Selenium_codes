package popus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=EAIaIQobChMIifG8xNGPhwMV8w2DAx1-WAYfEAAYASAAEgKhSvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\vmahi\\OneDrive\\Desktop\\OOPs\\Selenium\\Resume\\Tushar_resume.pdf");
	}

}
