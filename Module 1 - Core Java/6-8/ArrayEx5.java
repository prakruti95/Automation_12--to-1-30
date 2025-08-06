package com.a68;

import java.util.Scanner;

public class ArrayEx5 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter How Many Subject You want");
		num = sc.nextInt();
		
		int marks[] = new int[num];
		int i;
		
		int total = 0;
		float per;
		
		for(i=0;i<marks.length;i++)
		{
			System.out.println("Enter Marks For Subject"+(i+1)+":");
			marks[i] = sc.nextInt();
			
		}
		
		for(i=0;i<marks.length;i++)
		{
			//System.out.println("Marks are: "+marks[i]);
			total+=marks[i];
		}
		
		System.out.println("Total is: "+total);
		per = total/marks.length;
		System.out.println("Percentage is: "+per);
		

	}
}
