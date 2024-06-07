package com.Krish.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestingClass {

	public static void main(String[] args) {

		Map<String, String> mapOfUserData = new HashMap<>();
		
		mapOfUserData.put("FirstName", "Krish");
		mapOfUserData.put("LastName", "Daripa");
		mapOfUserData.put("PhoneNumber", "26773444");
		mapOfUserData.put("Email", "krish@gmail.com");
		
		Map<String, String> mapOfUserData1 = new HashMap<>();
		
		mapOfUserData1.put("FirstName", "Sandeep");
		mapOfUserData1.put("LastName", "Mandal");
		mapOfUserData1.put("PhoneNumber", "24563444");
		mapOfUserData1.put("Email", "sandeep@gmail.com");
		
		Map<String, String> mapOfUserData2 = new HashMap<>();
		
		mapOfUserData2.put("FirstName", "Kalyan");
		mapOfUserData2.put("LastName", "Ponnaganti");
		mapOfUserData2.put("PhoneNumber", "467734454");
		mapOfUserData2.put("Email", "kalyan@gmail.com");
		
		List<Map<String,String>> lstOfUserMaps = new ArrayList<>();
		lstOfUserMaps.add(mapOfUserData);
		lstOfUserMaps.add(mapOfUserData1);
		lstOfUserMaps.add(mapOfUserData2);
		
		for(Map<String,String> mp:lstOfUserMaps)
		{
			System.out.println(mp);
			for(Map.Entry<String, String> inmap:mp.entrySet())
			{
				System.out.println("Key: "+inmap.getKey() +".Value:"+ inmap.getValue());
			}
		}
	}

}
