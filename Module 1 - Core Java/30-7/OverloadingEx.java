package com.a307;

public class OverloadingEx 
{
	int cal(int a,int b)
	{
		return a+b;
	}
	
	int cal(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
		OverloadingEx o1 = new OverloadingEx();
		System.out.println(o1.cal(6,3));//9
		System.out.println(o1.cal(2,3,4));//24
	}
}
