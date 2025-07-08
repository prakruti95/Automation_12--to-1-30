package com.a87;

import java.util.Scanner;

public class maxex 
{
	public static void main(String[] args) 
	{
		int maxnum=0;//5
		
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//7845
		
		while(num>0)
		{
			int rem = num % 10;
			
			if(rem>maxnum)
			{
				maxnum=rem;
			}
			
			num=num/10;
		}
		System.out.println("Maximum Num is : "+maxnum);
		
		
	}
}
