package com.dsa.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

//Find sum of two numbers in an array matched with target number, if found print YES or NO
//input: array of num, target
public class TwoSum {

	public static void main(String[] args) {
		
		int n=5;
		int [] arr = {2,5,7,8,3,11};
		int target = 14;
		int[] res = twoSum2(arr,target);
		if(res.length>=1)
		{
			System.out.println("Result is:"+ res[0] + "&"+res[1]);
		}
		else 
		{
			System.out.println("No numbers found which adds up to:" + target);
		}
	}
	
	
	public static int[] twoSum(int[] arr, int target)
	{
		int sum;
		for(int i=0;i<arr.length-1;i++)
			for(int j=i+1;j<arr.length;j++)
			{
				sum = arr[i]+arr[j];
				if (sum == target)
				{
					return new int[] {i,j};
				}
			}
		
		return new int[] {};
	}

	public static int[] twoSum2(int[] nums, int target)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i<nums.length;i++)
		{
			int cur = nums[i];
			//cur+x=target;
			//x= target - cur;
			int x = target -cur;
			if(map.containsKey(x))
			{
				return new int[] {map.get(x),i};
			}
			map.put(cur, i);
		}
		return new int[] {};
	}
}
