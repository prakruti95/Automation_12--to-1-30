package com.a68;

//try,catch,throw,throws,finally

public class ExceptionEx1 
{
	public static void main(String[] args) 
	{
		
		
		
		try
		{
			int num = 10/0;
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Success");
		}
		
	}
}
