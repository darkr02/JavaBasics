package com.dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		
		String s = "abcabdc";

		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstring1(s));
	}
	
	static int lengthOfLongestSubstring1(String s)
	{
		int maxLength = 0;
		Map<Character,Integer> visitedChars = new HashMap<>();
		
		for(int right=0, left =0 ;right<s.length();right++)
		{
			char currentChar = s.charAt(right);
			if (visitedChars.containsKey(currentChar)
					&& visitedChars.get(currentChar) >=left)
			{
				left = visitedChars.get(currentChar) +1;
			}
			visitedChars.put(currentChar, right);
			maxLength = Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}
	static int lengthOfLongestSubstring(String s)
	{
		int maxLength = 0;
		for(int i=0;i<s.length();i++)
		{
			StringBuilder currSubstring = new StringBuilder();
			for(int j=i;j<s.length();j++)
			{
				if (currSubstring.indexOf(String.valueOf(s.charAt(j)))!=-1)
				{
					break;				
				}
				
				currSubstring.append(s.charAt(j));
				maxLength = Math.max(maxLength, currSubstring.length());
			}
		}
		return maxLength;
	}

}
