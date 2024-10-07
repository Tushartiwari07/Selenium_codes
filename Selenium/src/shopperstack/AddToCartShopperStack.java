package shopperstack;


import org.testng.annotations.Test;

public class AddToCartShopperStack extends BaseClassShopperStack
{
	@Test
	public void addToCart() throws InterruptedException
	{
		WelcomePageShopperStack wlcm=new WelcomePageShopperStack(driver);
		Thread.sleep(5000);

		wlcm.getKurtaAddToCartButton().click();
		
		wlcm.getAddToCartlink().click();
		Thread.sleep(5000);
		
		
		
	}

}
