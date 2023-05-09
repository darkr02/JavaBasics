package javaBasics;

import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {

	public static void main(String[] args) {
			
		String[] array = {"Java","Python"};
		List<String> list = Arrays.asList(array);
		
		for (String s:list)
		{
			System.out.println(s);
		}
		System.out.println(list.size());
		//System.out.println(list.

		Object[] array1 = list.toArray();
		

		for (int i=0;i<array1.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println(array1.length);
		for (Object s:array1)
		{
			System.out.println(s);
		}
	}

}
