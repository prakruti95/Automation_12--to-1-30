package com.a138;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetex3 
{
	public static void main(String[] args) 
	{
		LinkedHashSet set = new LinkedHashSet<>();
		
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
