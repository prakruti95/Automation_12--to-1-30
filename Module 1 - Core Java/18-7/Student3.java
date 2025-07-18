package com.a187;

public class Student3 
{
	int i;
	String n;
	
	//parameter
	public Student3(int id,String name) 
	{
		i = id;
		n = name;
	}
	
	void display()
	{
		System.out.println("Your id is "+i+"and your name is "+n);
	}
	
	public static void main(String[] args) 
	{
		Student3 s1 = new Student3(101,"Abcd");
		Student3 s2 = new Student3(102, "Pqrs");
		
		s1.display();
		s2.display();
	}
	
	
}
