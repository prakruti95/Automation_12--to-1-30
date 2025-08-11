package com.a118;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEx2 
{
	public static void main(String[] args) throws IOException 
	{
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your Id");
			String id = sc.next();
			
			System.out.println("Enter Your Name");
			String name = sc.next();
			
			System.out.println("Enter Your Pass");
			String pass = sc.next();
			
			String s1 = "\n Your id is: ";
			String s2 = "\n Your name is: ";
			String s3 = "\n Your password is: ";
			
			if(pass.equals("1234"))
			{
				FileOutputStream fout = new FileOutputStream("E://tops.txt");
				
				fout.write(s1.getBytes());
				fout.write(id.getBytes());
				
				fout.write(s2.getBytes());
				fout.write(name.getBytes());
				
				fout.write(s3.getBytes());
				fout.write(pass.getBytes());
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
			
			
	}
}
