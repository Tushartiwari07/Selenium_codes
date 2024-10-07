package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class TestScript
{
	@Test
	public void login()
	{
		Reporter.log("Open Browser",true);
		Reporter.log("Navigate to url",true);
		Reporter.log("Click on login",true);
		Reporter.log("Enter email",true);
		Reporter.log("Enter passward",true);
		Assert.assertEquals(true, false);

	}
}
