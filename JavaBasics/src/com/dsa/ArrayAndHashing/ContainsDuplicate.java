package com.dsa.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4, 2, 4, 5};
		int[] arr1 = {1,2,3,4,5};
		
		System.out.println(isDuplicateNum(arr1));
		System.out.println(isDuplicateNum1(arr1));
		System.out.println(isDuplicateNum3(arr1));
	}

	private static boolean isDuplicateNum1(int[] arr) {
		boolean b= false;
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			mp.putIfAbsent(arr[i], 0);
			mp.put(arr[i], mp.get(arr[i])+1);
			if (mp.get(arr[i])>1)
			{
				b=true;
				break;
			}
		}
		
		return b;
	}
	
	private static boolean isDuplicateNum3(int[] arr) {
		boolean b= false;
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(mp.containsKey(arr[i]))
			{
				b = true;
				break;
			}
			mp.put(arr[i], 0);
		}
		
		return b;
	}

	//Solution is O(n^2)
	private static boolean isDuplicateNum(int[] arr) {
		boolean b= false;
		for(int i=0; i<arr.length -1; i++)
		{
			for(int j=i+1; j<arr.length ; j++)
			{
				if(arr[i]==arr[j])
				{
					b= true;
					break;
				}
			}

		}
		
		return b;
	}

}
