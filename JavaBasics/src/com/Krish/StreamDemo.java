package com.Krish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(2,4,7,5,9,6);
		//lst.forEach(n -> System.out.println(n));
		//you can use the stream only once
		
//		  Stream<Integer> data = lst.stream();
		 		//data.forEach(n -> System.out.println(n));
		//System.out.println(data.count());
		/*
		 * Stream<Integer> sortedData = data.sorted(); sortedData.forEach(n ->
		 * System.out.println(n));
		 */
		/*
		 * 
		 * Stream<Integer> mappedData = data.sorted().map(n ->n*2); mappedData.forEach(n
		 * -> System.out.println(n));
		 */
		  int result = lst.stream()
		  		.filter(n -> n%2==1)
		  		.sorted()
		  		.map(n->n*2)
		  		.reduce(0, (c,e)->c+e);
		  		//.forEach(n -> System.out.println(n));
		  System.out.println(result);
	}

}
