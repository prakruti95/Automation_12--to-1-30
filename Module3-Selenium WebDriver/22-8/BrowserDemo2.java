package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserDemo2 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
//		DriverConnection connect = new DriverConnection();
//		//connect.getconnect("https://demoblaze.com/");
//		
//		DriverConnection.getconnect("https://demoblaze.com/").findElement(By.linkText("Log in")).click();
		
		 driver= DriverConnection.getconnect("https://demoblaze.com/");
		 
		 Thread.sleep(1000);
		 
		 WebElement elem1 = driver.findElement(By.linkText("Log in"));
		 elem1.click();
	
		 Thread.sleep(1000);
		 
		 WebElement elem2 = driver.findElement(By.id("loginusername"));
		 elem2.sendKeys("prakruti");
		 
		 WebElement elem3 = driver.findElement(By.id("loginpassword"));
		 elem3.sendKeys("1234");
		 
		 WebElement elem4 = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		 elem4.click();
		 
		 Thread.sleep(5000);
		 
		 WebElement elem5 = driver.findElement(By.linkText("Log out"));
		 elem5.click();
	}

}
