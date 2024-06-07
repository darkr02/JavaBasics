package com.Krish;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamAPIImpl {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(5,12,20,30,46,55);
		
		Function<Integer, Integer> f = new Function<>()
		{

			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
	
		};
		BinaryOperator<Integer> b = new BinaryOperator<>()
		{

			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
	
		};
		
		Predicate<Integer> p = new Predicate<>() {
			
			public boolean test(Integer t)
			{
				return t%5==0;
				
			}
		};
		
		Consumer<Integer> c = new Consumer<>()
		{

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
	
		};
		
		lst.forEach(c);
		System.out.println(lst.stream().map(e->e*2).reduce(0, Integer::sum));
		System.out.println(lst.stream().filter(e->e%5==0).reduce(0, Integer::sum));
	}

}
