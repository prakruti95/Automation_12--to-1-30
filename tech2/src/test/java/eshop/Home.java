package eshop;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home 
{
	//4
	@Test(groups = "smoke")
	public void login()
	{
		System.out.println("running login test");
		assertFalse(true);
	}
	
	//7
	@Test
	public void logout()
	{
		System.out.println("running logout test");
	}
	//3//6
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("runnig before every home method...");
	}
	//5//8
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("runnig after every home method...");
	}
	
	//2//9
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("runnig before  home class...");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("runnig after  home class...");
	}
	
	//1
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("runnig before  test...");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("runnig after test...");
	}
}
