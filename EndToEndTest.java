package TESTNG;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EndToEndTest 
{
WebDriver driver;
@BeforeMethod
public void setup()
{
	
	System.setProperty("webdriver.chrome.driver", "./src/exefiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do");	
}
@AfterClass
public void tearDown()
{
	System.out.println("@AfterClass");
	driver.close();
}
@AfterMethod
public void postcondition()
{
	System.out.println("@AfterMethod");
	driver.findElement(By.id("logoutLink")).click();
}
@Test(priority=1)
public void validlogin()
{
	System.out.println("Valid Login");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
}
@Test(priority=2)

	public void createCustomer()
	{
	System.out.println("Valid Login");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Tasks')]")).click();
	driver.findElement(By.linkText("Projects & Customers")).click();
	driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	driver.findElement(By.name("name")).sendKeys("Abhishekm1");
	driver.findElement(By.name("createCustomerSubmit")).click();
	
	}
}

