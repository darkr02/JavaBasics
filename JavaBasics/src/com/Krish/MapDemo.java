package com.Krish;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<>();	//Key Value Pair
		m.put("1", 56);
		m.put("2", 16);
		m.put("3", 26);
		m.put("4", 66);
		m.put("5", 86);
		//Using Map Entry
		Set <Map.Entry<String, Integer>> values = m.entrySet();
		for (Map.Entry<String, Integer> e: values)
		{
			System.out.println(e.getKey() + ": "+e.getValue());
		}
		
		//Using Advanced For loop with KeySet
		for (String a: m.keySet())
		{
			System.out.println("KeyName:" + a +" has a value:" + m.get(a));
		}
	}

}
