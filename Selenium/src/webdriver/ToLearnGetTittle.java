package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTittle 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.primevideo.com/collection/IncludedwithPrime");
		String title = c1.getTitle();//It is used to get the title of the webpage
		System.out.println(title);
		if(title.equals("Prime Video"))
		{
			System.out.println("User Navigated Sucessfully");
		}
		else
		{
			System.out.println("User failed to Navigate");
		}
	}
}
