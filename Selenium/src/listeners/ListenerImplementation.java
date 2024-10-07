package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import demowebshop.BaseClassForDemoWebShop;

public class ListenerImplementation extends BaseClassForDemoWebShop implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String localTime = LocalDateTime.now().toString().replace(":", "-");
		String methodName = result.getName();
		Reporter.log("---------------TestScript is failed------",true);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/"+methodName+localTime+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
