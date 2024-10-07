package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet 
{
   public static void main(String[] args) 
   {
	ChromeDriver c1 = new ChromeDriver();
	c1.get("https://www.primevideo.com/collection/IncludedwithPrime");//it is used to nevigate the web page
	c1.manage().window().maximize();
	c1.navigate().to("https://www.primevideo.com/collection/in-merch-english-language/ref=atv_hm_hom_c_7wLwwJ_4_2?jic=8%7CEgRzdm9k");
	c1.navigate().to("https://www.primevideo.com/detail/0GDPCQ65PO0YNZFG2JOQAKLVAF/ref=atv_sr_fle_c_Tn74RA_1_1_1?sr=1-1&pageTypeIdSource=ASIN&pageTypeId=B078YFBVW7&qid=1717154992418");
	

   }
}
