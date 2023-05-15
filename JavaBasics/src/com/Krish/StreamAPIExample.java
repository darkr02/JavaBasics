package com.Krish;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {

		List<Integer> arrList = Arrays.asList(2,4,6,8,10);
		
		Function<Integer, Integer> f = new Function<>()
				{
					@Override
					public Integer apply(Integer t) {

						return t*2;
					}
			
				};
			BinaryOperator<Integer> b = new BinaryOperator<>() {
				
				public Integer apply(Integer t, Integer u)
				{
					return t+u;
				}
			};
		Stream<Integer> sr =arrList.stream();
		Stream<Integer> sr1 = sr.map(f);
		int result  = sr1.reduce(0,b);
		System.out.println(result);
		
		//Only with one line you can achieve this.
		System.out.println(arrList.stream().map(i->i*2).reduce(0,(c,e)->c+e));

		//Alternate way
		System.out.println(arrList.stream().map(i->i*2).reduce(0,Integer::sum));
	}

}
