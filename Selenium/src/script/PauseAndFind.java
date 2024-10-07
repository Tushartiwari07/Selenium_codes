package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PauseAndFind 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=EAIaIQobChMIhb6hmp2IhwMVSKlmAh1QWQBaEAAYASAAEgIikvD_BwE");
	     WebElement mens = driver.findElement(By.xpath("//a[text()='Men']"));
			Actions act = new Actions(driver);
			act.moveToElement(mens).perform();
	     
	     driver.findElement(By.xpath("(//a[text()='Casual Shoes'])[1]")).click();
		
	}

}
