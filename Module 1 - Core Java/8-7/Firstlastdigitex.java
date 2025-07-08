package com.a87;

import java.util.Scanner;

public class Firstlastdigitex 
{
	public static void main(String[] args) 
	{
		int fdigit=0,ldigit=0;
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		ldigit = num % 10;//4
		
		while(num>0)
		{
			if(num>9)
			{
				num = num/10;
			}
			else
			{
				fdigit = num;
				num = num/10;
			}
		}
		int ans = fdigit+ldigit;
		System.out.println(ans);
	}
}
