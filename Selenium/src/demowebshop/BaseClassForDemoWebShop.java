package demowebshop;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class BaseClassForDemoWebShop 
{
	public static WebDriver driver;
	public FileInputStream fis ;
	public Properties prop;
	
	 public DemoWelcomePagePOM wlcm;
	 public DemoWebShopLoginPagePOM lp;
	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(@Optional("CHROME" ) String browserName) throws IOException
	{
		fis= new FileInputStream("./TestData/DemoWebShopTestData.properties");
		prop =new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		if(browserName.equalsIgnoreCase("chrome")) {
           driver= new ChromeDriver();
	    }
	    else if(browserName.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
	    }
	    else if(browserName.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
	}
//		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		wlcm=new DemoWelcomePagePOM(driver);
	    wlcm.getLoginLink().click();
	    lp= new DemoWebShopLoginPagePOM(driver);
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();	
		
	
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys(email);
//		driver.findElement(By.id("Password")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logout()
	{
		wlcm.getLogoutLink().click();
//		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
