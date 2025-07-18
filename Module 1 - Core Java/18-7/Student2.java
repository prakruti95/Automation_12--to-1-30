package com.a187;

public class Student2 
{
	static int count = 0;
	
	//default constructor
	public Student2() 
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
	}
	
	
}
