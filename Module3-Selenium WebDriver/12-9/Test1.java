package com.a129;

public class Test1 
{
	public static void main(String[] args) 
	{
		try
		{
			int data = 10/0;	
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
		catch (NullPointerException e)
		{
			// TODO: handle exception
		}
		
		
	}
}
