package com.a118;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex1 
{
	public static void main(String[] args) throws IOException 
	{
		Student s1 = new Student(101, "darshan");
		FileOutputStream fout = new FileOutputStream("E://tops2.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
	}
}
