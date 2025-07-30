package com.a307;

class Bank
{
	int rate()
	{
		return 0;
	}
}
class Sbi extends Bank
{
	int rate()
	{
		return 7;
	}
}
class Icici extends Bank
{
	int rate()
	{
		return 8;
	}
}
class Axis extends Bank
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx 
{
	public static void main(String[] args) 
	{
//		Sbi s = new Sbi();
//		Icici i = new Icici();
//		Axis a = new Axis();
//		
//		System.out.println(s.rate());//7
//		System.out.println(i.rate());//8
//		System.out.println(a.rate());//9
		
		
		Bank b ; 
		
		b = new Sbi();
		System.out.println(b.rate());//7
		
		b = new Icici();
		System.out.println(b.rate());//8
		
		b = new Axis();
		System.out.println(b.rate());//9
		
		
	}
}
