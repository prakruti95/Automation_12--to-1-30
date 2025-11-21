package Test1.Test2;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MyTest3 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		cap.setCapability("appPackage","com.androidsample.generalstore");
		
		cap.setCapability("appActivity","com.androidsample.generalstore.MainActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		
		Thread.sleep(2000);
		
//		 WebElement dropdownElement = driver.findElement(By.id("android:id/text1")); 
//		 Select select = new Select(dropdownElement);
//		 select.selectByVisibleText("Albania");
		 
		// Thread.sleep(2000);
		 
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Harsh");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
		 
//		 driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
//		 
//		 Thread.sleep(2000);
//		 
//		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 
	}
}
