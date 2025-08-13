package com.a138;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetex2 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		
		set.add("sahdev");
		set.add("manthan");
		set.add("darshan");
		set.add("sahdev");
		set.add("vishal");
		set.add("vipul");
	
		//System.out.println(set);
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
