package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl 
{
	public static void main(String[] args) 
	{
		ChromeDriver c1 = new ChromeDriver();
//		c1.get("https://www.instagram.com/?hl=en");
//	String url = c1.getCurrentUrl();
//	System.out.println(url);
//	if(url.equals("https://www.instagram.com/?hl=en"))
//			{
//		    System.out.println("User Navigates Successfully");
//	    }
//	else
//	{
//		System.out.println("User Failed to navitage");
//	}
		c1.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=8214207897877476271&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062010&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		String url = c1.getCurrentUrl();
		System.out.println(url);
			if(url.equals("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=8214207897877476271&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062010&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1"))
			{
		    System.out.println("User Navigates Successfully");
	    }
	else
	{
		System.out.println("User Failed to navitage");
	}
	}
	

}
