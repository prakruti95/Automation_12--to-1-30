package com.a127;

public class ArmstrongNumEx 
{
	
	public static boolean checknum(int num)
	{
		int originalnum = num;
		int sumOfPowers = 0;
		int numberOfDigits = String.valueOf(num).length();
		
		while(num>0)
		{
			int digit = num%10;//3//2//1
			sumOfPowers+=Math.pow(digit,numberOfDigits);
			num/=10;
		}
		
		
		return originalnum==sumOfPowers;
	}
	
	public static void main(String[] args) 
	{
			int num = 1234;
			int num2 = 370;
			int num3 = 465;
			System.out.println(checknum(num));
			System.out.println(checknum(num2));
			System.out.println(checknum(num3));
			
	}
}
