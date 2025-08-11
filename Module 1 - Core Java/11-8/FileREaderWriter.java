package com.a118;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileREaderWriter {
	public static void main(String[] args) throws Exception 
	{
		FileWriter fw = new FileWriter("E://tops3.txt");
		String s = "Hello , this is my data";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("E://tops3.txt");
		int i=0;
	
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
