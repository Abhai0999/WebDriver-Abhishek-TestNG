package TESTNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ActitimeTest 
{
	WebDriver driver;
@BeforeMethod
public void preCondition()
{
	System.out.println("@BeforeMethod");
	System.setProperty("webdriver.chrome.driver", "./src/exefiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1/login.do");
}
@AfterMethod
public void postCondition()
{
	System.out.println("@AfterMethod");
	driver.close();
}
@Test(priority=1)
public void validLogin()
{
	System.out.println("Valid Login");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
}
@Test(priority=2)
public void Invalidlogin()
{
	System.out.println("Invalid Login");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("12345");
	driver.findElement(By.id("loginButton")).click();
}
}
