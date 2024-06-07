package com.Krish;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		
		List<Integer> lst = Arrays.asList(1,5,8,3,6,2);
		
		//Separate Odd and Even Numbers
		Map<Boolean, List<Integer>> map = lst.stream().collect(Collectors.partitioningBy(i-> i%2==0));
		
		System.out.println(map);
		for(Map.Entry<Boolean, List<Integer>> m: map.entrySet())
		{
			System.out.println(m.getKey() +":"+ m.getValue());
		}
		
		//Frequency of character in string
		String inputString = "Hello";
		Map<Character, Long> inputs = inputString.chars()
									.mapToObj(c->(char) c)
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(inputs);
		Map<Character, Long> sortedInputs = new TreeMap<>(inputs);
		System.out.println(sortedInputs);
		for(Map.Entry<Character, Long> m: sortedInputs.entrySet())
		{
			System.out.println(m.getKey() +":"+ m.getValue());
		}
		
		
		
		
		
	}

}
