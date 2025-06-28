package com.a286;

public class SimpleIntreEx 
{
	public static void main(String[] args) 
	{
		//I=PRN/100;
		
		int prin = 20000;
		int rate = 5;
		int year = 3;
		int intrest;
		
		intrest = prin*rate*year/100;
		
		System.out.println("You have to Pay Total Intrest : "+intrest);
		
		int ans = prin+intrest;
		
		System.out.println("You have to Pay Total Amount : "+ans);

		
	}
}
