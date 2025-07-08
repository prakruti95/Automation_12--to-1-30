package com.a87;

import java.util.Scanner;

public class TableEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Any Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int ans = num*i;
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}
