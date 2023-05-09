package com.amazon;


//Merge two sorted arrays
public class MergreTwoSortedArrays {

	public static void main(String[] args) {

		long[] arr1 = {1,3,5,7};
		long[] arr2 = {0,2,6,8,9};
			
		mergeArray(arr1,arr2,arr1.length,arr2.length);
	}

	//MergeArray Function
	public static void mergeArray(long[] arr1, long[] arr2, int n, int m) {
		int i =0, j=0,k=0;
		long[] arr3 = new long[n+m];
		
		while(i<n&&j<m)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k++] = arr1[i++];
			}
			else
			{
				arr3[k++] = arr2[j++];
			}
		}
		while (i<n)
		{
			arr3[k++] = arr1[i++];
		}
		while (j<m)
		{
			arr3[k++] = arr2[j++];
		}
		for (long l: arr3)
		{
			System.out.println(l);
		}
	}
	

}
