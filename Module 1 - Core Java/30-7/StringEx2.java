package com.a307;

public class StringEx2 
{
	public static void main(String[] args)
	{
		
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = "saurav";
		String s4 = "SACHIN";
		String s5 = " Hello ";
		
		System.out.println(s1.length());
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		System.out.println(s5.trim());
		
		System.out.println(s1.startsWith("sa"));
		System.out.println(s1.endsWith("n"));
		
		
	}
}
