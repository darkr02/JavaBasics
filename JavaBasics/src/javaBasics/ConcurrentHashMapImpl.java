package javaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl {

public static void main(String a[]) {

	Map<String, String> hMap= new ConcurrentHashMap<>();
	//ConcurrentHashMap<String, String> hMap= new ConcurrentHashMap<>();
	
	hMap.put("1", "Sandeep");
	hMap.put("2", "Krish");
	hMap.put("3", "Kalyan");
	hMap.put("4", "Pavani");
	hMap.put("5", "Mahesh");
	hMap.put("6", "Sid");
	
	Iterator<String> it = hMap.keySet().iterator();
	
	while(it.hasNext())
	{
		String key = it.next();
		if (key.equals("1"))
		{
			//ConcurrentModificationException - with HashMap
			//Solution - ConcurrentHashMap - Bucket - 16, Concurrency Level 16 - Segment - 16
			hMap.put("7", "Aravinth");
		}
	}
	
	
	for(Map.Entry<String, String> e:hMap.entrySet())
	{
		System.out.println("Key is: "+ e.getKey() +", Value is:"+e.getValue());
	}
	
	
}

}
