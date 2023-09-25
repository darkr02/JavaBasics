package com.dsa;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	
	/**
	 * function: removeDuplicate
	 * Algorithm: remove duplicates from a sorted array
	 * compare 1st element with 2nd one and if not same enter into the 1st position
	 * check 2nd with 3rd and enter in 2nd position if no matches found continue
	 * If matches found don't enter.
	 * Time complexity: O(n), Space Complexity: O(1)
	 */

	public static int removeDuplicate(int[] arr1) {
		
		if (arr1.length ==0)
		{
			return 0;
		}
		int index = 1;
		for ( int i =1; i<arr1.length;i++)
		{
			System.out.println(index);
			System.out.println(i);
			if (arr1[i]!=arr1[index-1])
			{
				arr1[index++] = arr1[i];
			}
			
		}
		return index;
	}
	
	public static void main(String[] args) {
		
		int[] arr  = {1,3,5,5,6,6,7,8,9,9,10};
		System.out.println("Length of the array is: "+arr.length);
		System.out.println("array is: "+Arrays.toString(arr));
		int lenAfterDuplicateRemove = removeDuplicate(arr);
		
		System.out.println("Length of the array is: "+lenAfterDuplicateRemove);
		for (int i =0; i<lenAfterDuplicateRemove;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
