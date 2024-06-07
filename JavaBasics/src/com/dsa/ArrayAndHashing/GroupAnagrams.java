package com.dsa.ArrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String[] strs = {"cat", "act","rat","ate","eat","tea"};
		List<String> lst = Arrays.asList(strs);
		
		System.out.println(lst);
		System.out.println(groupAnagram(strs));
		System.out.println(groupAnagram1(lst));
	}
	
	static List<List<String>> groupAnagram(String[] strs)
	{
		Map<String, List<String>> groups = new HashMap<>();
		
		for (String s: strs)
		{
			char[] chr = s.toCharArray();
			Arrays.sort(chr);
			String key = String.valueOf(chr);
			groups.putIfAbsent(key, new ArrayList<>());
			groups.get(key).add(s);
		}
		
		return new ArrayList<>(groups.values());
	}
	static List<List<String>> groupAnagram1(List<String> lst)
	{
		Map<String, List<String>> groups = new HashMap<>();
		
		for (String s: lst)
		{
			char[] chr = s.toCharArray();
			Arrays.sort(chr);
			String key = String.valueOf(chr);
			if (groups.containsKey(key))
			{
				groups.get(key).add(s);
			}
			else
			{
				List<String> lst1 = new ArrayList<>();
				lst1.add(s);
				groups.put(key,lst1);
			}
		}
		
		return new ArrayList<>(groups.values());
	}
}
