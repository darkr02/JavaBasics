package com.dsa;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		
		int[] arr= {1,0,2,0,4,6,8};
		System.out.println("Input:"+Arrays.toString(arr));

		arr = moveAllZeroesToEnd(arr);
		System.out.println("Output:"+ Arrays.toString(arr));
	}

	private static int[] moveAllZeroesToEnd(int[] arr) {

		int len = arr.length;
		int count = 0;
		
		for(int i=0;i<len;i++)
		{
			if (arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		
		while(count<len)
		{
			arr[count++]=0;
		}
		
		return arr;
	}

}
