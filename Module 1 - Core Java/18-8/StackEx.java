package com.a188;

import java.util.Stack;

public class StackEx 
{
	
	static void push(Integer i, Stack st)
	{
		st.push(i);
		System.out.println(i);
		System.out.println(st);
	}
	
	static void pop(Stack st)
	{
		Integer i = (Integer) st.pop();
		System.out.println(i);
		System.out.println(st);
	}
	
	public static void main(String[] args) 
	{
		Stack st = new Stack<>();
		
		push(10,st);
		push(20,st);
		push(30,st);
		push(40,st);
		
		try
		{
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
		}
		catch(Exception e)
		{
			System.out.println("No data");
		}
		
	}
}
