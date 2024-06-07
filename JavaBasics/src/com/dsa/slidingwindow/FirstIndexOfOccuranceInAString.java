package com.dsa.slidingwindow;

public class FirstIndexOfOccuranceInAString {

	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle = "ode";
		
		System.out.println(firstIndexOf(haystack, needle));

	}

	private static int firstIndexOf(String haystack, String needle) {

		int h = haystack.length();
		int n = needle.length();
		
		
		for (int ws=0; ws<=h-n;ws++)
		{
			for(int i=0;i<n;i++)
			{
				if(needle.charAt(i)!=haystack.charAt(ws+i))
				{
					break;
				}
				if(i==n-1)
				{
					return ws;
				}
			}
		}
		return -1;
	}

}
