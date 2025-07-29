package com.a287;

class T1
{
	String color = "black";
}
class T2 extends T1
{
	String color = "white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx 
{
	public static void main(String[] args) 
	{
		T2 t2 = new T2();
		t2.display();
	}
}
