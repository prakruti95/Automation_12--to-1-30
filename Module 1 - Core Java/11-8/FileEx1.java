package com.a118;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx1 
{
	public static void main(String[] args) throws IOException 
	{
		
//		try 
//		{
//			String s = "tops tech";
//			FileOutputStream fout =  new FileOutputStream("E://xyz.txt");
//			fout.write(s.getBytes());
//		}
//		catch (Exception e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//		System.out.println("Success");
		
		
			String s = "tops tech";
			FileOutputStream fout =  new FileOutputStream("E://xyz.txt");
			fout.write(s.getBytes());
			System.out.println("Success");
		
	}
}
