package com.dsa;

import java.util.Arrays;

/*
 * 
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * For example, Given [100, 4, 200, 1, 3, 2] , The longest consecutive elements sequence is [1, 2,3, 4] . 
 * Return its length: 4
 *  Time Complexity: O(n)，Space Complexity: O(n)
 */


public class LongestConsecutiveSequesnce {
	
	public static int longestConsecutiveSeq(int[] arr)
	{
		return 0;
	}

	public static void main(String[] args) {

	int[] arr = {100,4,200,1,3,2};
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	}

}
