package com.leetcode;


//Find sum of two numbers in an array matched with target number, if found print YES or NO
//input: array of num, target
public class TwoSum {

	
	
	public static String twoSum(int n, int[] arr, int target)
	{
		int sum;
		int addition = Integer.sum(1, 2);
		System.out.println(addition);
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
			{
				sum = arr[i]+arr[j];
				if (sum == target)
				{
					return "YES";
				}
			}
		
		return "NO";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int [] arr = {2,5,7,8,3};
		int target = 14;
		String res = twoSum(n,arr,target);
		System.out.println("Result is:"+ res);
		

	}

}
