package com.a208;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethodEx 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Workspaces\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		String actualresult = driver.getTitle();
		System.out.println(driver.getTitle());
		String expectedresult = "TOPS Career Center - Welcome to TOPS Technologies";
		
		if(expectedresult.equals(actualresult))
		{
			System.out.println("Verification Successful - The correct title is displayed on the web page."); 

		}
		else
		{
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}
		
		
	}
}
