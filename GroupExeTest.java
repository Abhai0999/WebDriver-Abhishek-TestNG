package TESTNG;

import org.testng.annotations.Test;

public class GroupExeTest 
{
@Test(groups= {"Smoke"})
public void login()
{
System.out.println("login");	
}
@Test(groups= {"Smoke"})
public void Delete()
{
System.out.println("Delete");	
}
@Test(groups= {"Sanity"})
public void Clear()
{
System.out.println("Clear");	
}
@Test(groups= {"Regression"})
public void View()
{
System.out.println("View");	
}
@Test(groups= {"Regression"})
public void Blocked()
{
System.out.println("Blocked");	
}
}
