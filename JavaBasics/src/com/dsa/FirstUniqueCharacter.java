package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {

		System.out.println(firstUniqueCharIndex("aabbc"));
	}

	private static int firstUniqueCharIndex(String s) {
		Map<Character,Integer> count = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			count.put(c, count.getOrDefault(c, 0)+ 1);
		}
		
		for(int j=0;j<s.length();j++)
		{
			if(count.get(s.charAt(j))==1)
			{
				return j;
			}
		}
		
		return -1;
	}

}
