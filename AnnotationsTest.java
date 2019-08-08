package TESTNG;

import org.testng.annotations.*;

public class AnnotationsTest 
{
@BeforeSuite
public void BS()
{
	System.out.println("@BeforeSuite");
}
@AfterSuite
public void AS()
{
	System.out.println("@AfterSuite");
}
@BeforeTest
public void BT()
{
	System.out.println("@Before Test");
}
@AfterTest
public void AT()
{
	System.out.println("@AfterTest");
}
@BeforeMethod
public void BM()
{
	System.out.println("@BeforeMethod");
}
@AfterMethod
public void AM()
{
	System.out.println("@AfterMethod");
}
@Test
public void Test()
{
	System.out.println("@Test");
}
}
