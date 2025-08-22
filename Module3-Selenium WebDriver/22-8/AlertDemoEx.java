package com.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemoEx 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		driver= DriverConnection.getconnect("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
//		WebElement elem1 = driver.findElement(By.id("alertButton"));
//		elem1.click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		WebElement elem1 = driver.findElement(By.id("timerAlertButton"));
//		elem1.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		WebElement btn  =driver.findElement(By.id("confirmButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		//alert.accept();
//		alert.dismiss();
		
		WebElement btn  =driver.findElement(By.id("promtButton"));
		btn.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("welcome");
		alert.accept();
		//alert.dismiss();
//		
		
		
		
		
		
		
	}
}
