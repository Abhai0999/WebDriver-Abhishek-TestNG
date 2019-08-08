package TESTNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@BeforeMethod
	@Parameters({"Browser","BaseURL"})
	public void preCondn(String BrowserName,String URL)
	{
		System.out.println(BrowserName+", "+URL);	
	}
	@Test
	public void Demo()
	{
		System.out.println("Demo");
		
	}

}
