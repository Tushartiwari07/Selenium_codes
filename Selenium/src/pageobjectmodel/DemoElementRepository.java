package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoElementRepository
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePageDemoWebShop wp =new WelcomePageDemoWebShop(driver);
//		wp.getRegisterLink().click();
		wp.getLoginLink().click();
//		wp.getShoppinhCartLink().click();
//		wp.getWishlistLink().click();
		LoginPageDemoWebShop lp=new LoginPageDemoWebShop(driver);
		lp.getEmailTextField().sendKeys("tushar");
		lp.getPasswordTextField().sendKeys("tiwari");
		
		
	}

}
