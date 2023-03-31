package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassTNG1 
{
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass of Class1");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod of Class1");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 of Class1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 of Class1");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3 of Class1");
	}
		
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod of Class1");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass of Class1");
	}
}
