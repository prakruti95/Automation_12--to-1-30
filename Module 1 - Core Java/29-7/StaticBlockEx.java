package com.a287;

public class StaticBlockEx 
{
	
	
	//static block is a block which will execute before main method.
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome");
	}
	
	static
	{
		System.out.println("Hello");
	}
}
