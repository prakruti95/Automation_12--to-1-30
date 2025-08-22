package com.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection 
{
	public static WebDriver getconnect(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Workspaces\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
