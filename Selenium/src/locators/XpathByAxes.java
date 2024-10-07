package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vmahi/OneDrive/Desktop/html/html/MovieTable.html");
		String collections = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td")).getText();
		System.out.println(collections);
		String position = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td")).getText();
		System.out.println(position);


	}

}
