package eshop;

import org.testng.annotations.Test;

public class Payment {
	//2
	@Test(groups = {"smoke","sanity"})
	public void creditCard()
	{
		System.out.println("Runing creditcard payment");
	}
	//3
	@Test
	public void debitCard()
	{
		System.out.println("running debitcard payment");
	}
	
	//1
	@Test(groups = "sanity")
	public void cod()
	{
		System.out.println("running cod payment");
	}
}
