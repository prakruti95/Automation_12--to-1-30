package com.a17;

public class SwitchEx 
{
	public static void main(String[] args) 
	{
		int num=2;
		
		switch(num)
		{
			case 1: System.out.println("Your Selected Language is English");
			break;
			
			case 2: System.out.println("Your Selected Language is Hindi");
			break;
			
			case 3: System.out.println("Your Selected Language is Gujarati");
			break;
			
			default:System.out.println("Your Number is not valid");
			break;
		}
	}
}
