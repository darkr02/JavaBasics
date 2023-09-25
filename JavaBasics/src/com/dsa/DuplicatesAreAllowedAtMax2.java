package com.dsa;

import java.util.Arrays;

public class DuplicatesAreAllowedAtMax2 {

	
	/**
	 * function: DuplicatesAreAllowedAtMax2
	 * Algorithm: two duplicates are allowed from a sorted array
	 * compare 1st element with 2nd one and if not same enter into the 1st position
	 * check 2nd with 3rd and enter in 2nd position if no matches found continue
	 * If matches found don't enter.
	 * Time complexity: O(n), Space Complexity: O(1)
	 */

	public static int twoDuplicates(int[] arr1) {
		
		if (arr1.length <=2)
		{
			return arr1.length;
		}
		int index = 2;
		for ( int i =2; i<arr1.length;i++)
		{
			
			if (arr1[i]!=arr1[index-2])
			{
				arr1[index++] = arr1[i];
			}
			
		}
		return index;
	}
	
	public static void main(String[] args) {
		
		int[] arr  = {1,3,5,5,6,6,7,8,9,9,9,10};
		System.out.println("Length of the array is: "+arr.length);
		System.out.println("array is: "+Arrays.toString(arr));
		int lenAfterDuplicateRemove = twoDuplicates(arr);
		
		System.out.println("Length of the array is: "+lenAfterDuplicateRemove);
		for (int i =0; i<lenAfterDuplicateRemove;i++)
		{
			System.out.print(arr[i] + ",");
		}
	}

}
