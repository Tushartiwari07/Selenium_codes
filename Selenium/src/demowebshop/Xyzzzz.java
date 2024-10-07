package demowebshop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Xyzzzz
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("./TestData/DemoWebShopTestData.properties");
		Properties prop =new Properties();
		prop.load(fis);
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		System.out.println(email);
		System.out.println(password);
	}

}
