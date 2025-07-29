package com.a287;
//this,static,super,final

//this keyword is used to print variable's value 
//when it's having a same name


public class ThisEx 
{
	String name;
	String surname;
	
	public ThisEx(String name,String surname) 
	{
		this.name = name;
		this.surname = surname;
	}
	
	void display()
	{
		System.out.println(name+" "+surname);
	}
	
	public static void main(String[] args) 
	{
		ThisEx k1 = new ThisEx("Manthan","Kanjiya");
		k1.display();
		
	}
}
