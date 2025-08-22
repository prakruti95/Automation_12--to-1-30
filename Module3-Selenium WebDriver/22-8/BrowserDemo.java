package com.basics;

public class BrowserDemo 
{
	public static void main(String[] args)
	{
		DriverConnection connect = new DriverConnection();
		connect.getconnect("https://www.tops-int.com/");
	}
}
