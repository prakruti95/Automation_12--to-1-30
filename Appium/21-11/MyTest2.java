package Test1.Test2;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MyTest2 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		
		cap.setCapability("appPackage","com.facebook.lite");
		
		cap.setCapability("appActivity","com.facebook.lite.MainActivity");
		
		AndroidDriver<MobileElement>driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		Thread.sleep(4000);
		driver.findElement(By.className("android.widget.MultiAutoCompleteTextView")).sendKeys("9999999999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[2]")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
		System.out.println("executed");
	}
}
