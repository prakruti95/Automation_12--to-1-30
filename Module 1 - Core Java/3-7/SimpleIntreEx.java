package com.a37;

import java.util.Scanner;

public class SimpleIntreEx 
{
	public static void main(String[] args) 
	{
		//I=PRN/100;
		Scanner sc = new Scanner(System.in);
		int prin,rate,year;
		
		System.out.println("Enter Pri Amount: ");
		prin = sc.nextInt();
		
		System.out.println("Enter Rate of Intrest: ");
		rate = sc.nextInt();
		
		System.out.println("Enter Years: ");
		year = sc.nextInt();
		
		
		
		int intrest;
		
		intrest = prin*rate*year/100;
		
		System.out.println("You have to Pay Total Intrest : "+intrest);
		
		int ans = prin+intrest;
		
		System.out.println("You have to Pay Total Amount : "+ans);

		
	}
}
