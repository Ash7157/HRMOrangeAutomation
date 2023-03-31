package testPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage1.LoginPage;
import testUtility.ReadFileData;


public class LoginTestClass extends BaseClass
{
	LoginPage login;
	ReadFileData r;
	
	@BeforeClass
	public void beforeclass() throws InterruptedException
	{
//		System.setProperty("webdriver.msedge.driver", "src\\test\\resources\\driver\\msedgedriver.exe");
		
//		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\driver\\geckodriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		
//		Thread.sleep(3000);
		login = new LoginPage(driver);
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod of Class1");
	}
	
	@Test
	public void VerifyLoginFunctionalityWithCorrectData() throws InterruptedException, EncryptedDocumentException, IOException
	{
		logger = report.createTest("Verify login functionality with correct data");
		  SoftAssert s = new SoftAssert();
		
//		  login.sendUsername();
		  login.sendUsername(r.fetchDataFromExcel(8,0));
//		  login.sendPassword();
		  login.sendPassword(r.fetchDataFromExcel(8,1));
		  login.ClickOnLoginButton();
		 
//		  String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//		  String CurrentURL = driver.getCurrentUrl();
		  
		  boolean result=login.CheckVisibilityofAdminTab();
		  
//		  Assert.assertEquals(CurrentURL, ExpectedURL);
//		  s.assertEquals(CurrentURL, ExpectedURL);
		  
		  System.out.println("Soft Assert is Executed");
		  
		  Assert.assertTrue(result);
		  System.out.println("Test Case is Ended");
		  s.assertAll();
	}
	
	@Test
	public void VerifyLoginFunctionalityWithInCorrectData()
	{
		logger = report.createTest("Verify login functionality with incorrect data");

////		  login.sendUsername();
//		  login.sendUsername("admin");
////		  login.sendPassword();
//		  login.sendPassword("admin1234");
//		  login.ClickOnLoginButton();
		System.out.println("VerifyLoginFunctionalityWithInCorrectData");
		Assert.fail();
	}	

}
