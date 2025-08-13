package com.a138;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("android");
		list.add("java");
		list.add("php");
		list.add("ios");
		//list.add(1);
		
		ArrayList list2 = new ArrayList<>();
		list2.add("WD");
		list2.add("GD");
		list2.add("UI/UX");
		list2.add("php");
		
//		list.addAll(list2);
//		
//		list.remove(1);
//		list.remove("php");
//		
//		list.removeAll(list2);
		list.retainAll(list2);
		
		//System.out.println(list);
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		
	}
}
