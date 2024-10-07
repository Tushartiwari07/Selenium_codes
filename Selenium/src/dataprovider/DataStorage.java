package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage 
{
	@DataProvider
	public String[][] loginData()
	{
		String data[][]= {
				{"user","user"},
				{"abcd","wxyz"}
				
		};
		return data;
	}

}
