package pompackage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomUtility.ElementWait;

public class LoginPage 
{
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[contains(.,'Admin')]")
	private WebElement admin;
	
//	@FindBy(xpath = "//img[@alt=\\\"client brand banner\\\"]/ancestor::a")
//	private WebElement webdriverscreenshoot;
	
	public LoginPage(WebDriver driver) throws InterruptedException				//Constructor use name of class
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
//		Thread.sleep(3000);
	}
	
//	public void sendUsername()
//	{
//		username.sendKeys("Admin");
//	}
	
	public void sendUsername(String uName)
	{
		ElementWait.waitForElement("//input[@name='username']", 20, driver);
		
		username.sendKeys(uName);
	}
	
//	public void sendPassword()
//	{
//		password.sendKeys("admin123");
//	}
	
	public void sendPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void handleAlert()
	{
		driver.switchTo().alert();
	}
	
	public boolean CheckVisibilityofAdminTab()
	{
		boolean result = admin.isDisplayed();
		return result;
	}
	
//	public boolean ScreenShootOfWebDriver()
//	{
//		boolean result1 = webdriverscreenshoot.isDisplayed();
//		return result1;
//	}

}
