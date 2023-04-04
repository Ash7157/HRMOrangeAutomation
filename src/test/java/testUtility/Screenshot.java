package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Screenshot 
{
	public static String capturePageScreenshot(WebDriver driver) throws IOException
	{
		System.getProperty("user.dir");     //path of current folder (till HRMOrange "C:\Users\HP\eclipse-workspace\HRMOrange\")
		String path = System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"Screenshots"+File.separator+System.currentTimeMillis()+".png";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileHandler.copy(source, dest);
		return path;
	}
}
