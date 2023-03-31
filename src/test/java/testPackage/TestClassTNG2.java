package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTNG2 
{
	@Parameters({"browserName"})
	@BeforeTest
	public void beforetest(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.out.println("Opening the Chrome Browser");
		}
		else if(browserName.equals("firefox"))
		{
			System.out.println("Opening the Firefox Browser");
		}
		else if(browserName.equals("safari"))
		{
			System.out.println("Opening the Safari Browser");
		}
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass of Class2");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod of Class2");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 of Class2");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 of Class2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3 of Class2");
	}
		
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod of Class2");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass of Class2");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.err.println("aftertest of Class2");
	}
}
