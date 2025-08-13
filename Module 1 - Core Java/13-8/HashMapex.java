package com.a138;

import java.util.HashMap;
import java.util.Map;

public class HashMapex 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("a",1);
		map.put("b",2);
		map.put("c",3);
		map.put("d",4);
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}
}
