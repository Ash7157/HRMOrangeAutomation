package pompackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath = "//*[contains(text(),'User Management ')]")
	private WebElement userman;
	
	@FindBy(xpath = "//*[contains(text(),'Users')]")
	private WebElement users;
	
	@FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--active')])[2]")
	private WebElement username;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement selectuserrole;
	
	@FindBy(xpath = "//div[@role='option']//span[text()='Admin']")
	private WebElement userrole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeename;
	
	@FindBy(xpath = "//div[@role='option']//span[text()='Orange  Test']")
	private WebElement selectempname;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;
	
	@FindBy(xpath = "(//*[contains(text(),'Enabled')])[1]")
	private WebElement selectstatus;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium oxd-button--ghost')]")
	private WebElement selectreset;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")
	private WebElement selectsearch;
	
	public HomePage(WebDriver driver)				//Constructor use name of class
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdmin()
	{
		admin.click();
	}
	
	public void clickusermanagement()
	{
		userman.click();
	}
	
	public void clickusers()
	{
		users.click();
	}
	
	public void sendUsername()
	{
		username.sendKeys("Ash123");
	}
	
	public void selectUserrole()
	{
		selectuserrole.click();
	}
	
	public void clickuserrole()
	{
		userrole.click();
	}
	
	public void sendemployeename()
	{
		employeename.sendKeys("orange");
	}
	
	public void clickselectempname()
	{
		selectempname.click();
	}
	
	public void clickstatus()
	{
		status.click();
	}
	
	public void clickselectstatus()
	{
		selectstatus.click();
	}
	
	public void clickreset()
	{
		selectreset.click();
	}
	
	public void clicksearch()
	{
		selectsearch.click();
	}
}
