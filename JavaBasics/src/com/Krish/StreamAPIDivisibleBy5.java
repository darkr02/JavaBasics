package com.Krish;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDivisibleBy5 {

	public static void main(String[] args) {

		List<Integer> arrList = Arrays.asList(12,25,30,46,55,76,87,90);
		
		//add all numbers which are divisible by 5
		int result = 0; 
		//Normal for loop
		/*
		 * for (int i = 0; i<arrList.size();i++) { if (arrList.get(i)%5==0) { result +=
		 * arrList.get(i); } }
		 */		
		for (int i : arrList)
		{
			if (i%5==0)
			{
				result += i;
			}
		}
		System.out.println(result);
		
		//using StreamAPI
		
		System.out.println(arrList.stream()
									.filter(i->i%5==0)
									.reduce(0, (c,e)->c+e));
		System.out.println(arrList.stream()
				.filter(i->i%5==0)
				.reduce(0, Integer::sum));
	}

}
