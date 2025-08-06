package com.a68;

public class ThrowEx 
{
	
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not valid");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String[] args) 
	{
		validate(11);
	}
}
