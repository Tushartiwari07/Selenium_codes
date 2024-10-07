package shopperstack;

import org.testng.annotations.Test;

public class RemoveFromCart extends BaseClassShopperStack
{
	@Test
	public void removeFromCart() throws InterruptedException
	{
		WelcomePageShopperStack wlcm=new WelcomePageShopperStack(driver);
		Thread.sleep(5000);

		wlcm.getKurtaAddToCartButton().click();
		
		wlcm.getAddToCartlink().click();
		Thread.sleep(5000);
		
		wlcm.getRemoveFromCart().click();
		Thread.sleep(2000);
		
		wlcm.getYesButtonRemoveFromCart().click();
//		
//		wlcm.getRemoveFromCart().click();
		Thread.sleep(2000);
	

		
	}

}
