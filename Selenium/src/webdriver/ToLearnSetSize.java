package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize {

	public static void main(String[] args) 
	{
		ChromeDriver c1 =new ChromeDriver();
		c1.get("https://www.jiocinema.com/");
		c1.manage().window().maximize();
	    c1.manage().window().setSize(new Dimension(900, 1000));//It is used to set the size of size of the Windows
		
		
	}

}
