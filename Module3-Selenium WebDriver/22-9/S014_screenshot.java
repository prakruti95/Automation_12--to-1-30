import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
public class S014_screenshot 
{
	
	public static void getScreenShot(WebDriver driver, String imgname)
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\img\\"+imgname+".png");
		try 
		{
			FileUtils.copyFile(source, dest);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("screenshot taken");
		
		

		
		
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = DriverConnection.getconnect("https://demoqa.com/automation-practice-form");
		getScreenShot(driver, "err");
	}
	
}
