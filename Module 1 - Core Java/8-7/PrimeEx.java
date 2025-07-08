package com.a87;

import java.util.Scanner;

public class PrimeEx 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//5
		int count =0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				//System.out.println(count);
			}
		}
		if(count>2)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
	}
}
