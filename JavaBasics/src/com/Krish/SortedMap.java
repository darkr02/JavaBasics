package com.Krish;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class SortedMap {

	public static void main(String[] args) {

		Map<String, String> mp = new TreeMap<>();
		mp.put("step1", "POST");
		mp.put("step2", "Patch");
		mp.put("step3", "GET");
		mp.put("step4", "PatchPayment");
		mp.put("step5", "");
		
		/*
		 * for (String s:mp.keySet()) { System.out.println("KeyName:"+s + ". Value: "
		 * +mp.get(s)); }
		 */
		//
		//BiConsumer<T, U>
		//mp.forEach((k,v)-> System.out.println("Key: "+ k + " Value: "+ v));
		
		/*mp.forEach((k,v) -> {
			
					if(v!="")
					{
						System.out.println("Key: "+ k + " Value: "+ v);
					}
				});*/
		
		mp.forEach((k,v) -> {printMap(k,v);});
	}
	
	public static void printMap(String k, String v)
	{
		if(v!="")
		{
			System.out.println("Key: "+ k + " Value: "+ v);
		}
		
	}

}
