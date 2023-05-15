package com.Krish;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPIFilter {

	public static void main(String[] args) {

		List<Integer> arrList = Arrays.asList(12,25,30,46,55,76,87,90);
		List<Integer> arrList1 = Arrays.asList(12,46,76,87);
		
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%5==0;
			}
			
		};
		System.out.println(arrList.stream()
									.filter(p)
									.map(i->i*2)
									.reduce(0, Integer::sum));
		//.filter and map do lazy evaluation after the terminal methods(like findFirst) execution. 
		System.out.println(arrList1.stream()
				.filter(p)
				.map(i->i*2)
				.findFirst()
				.orElse(0));

	}

}
