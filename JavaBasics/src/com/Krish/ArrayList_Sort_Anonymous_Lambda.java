package com.Krish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayList_Sort_Anonymous_Lambda {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();
		List<Integer> lst1 = Arrays.asList(1, 3, 4, 6, 7);// Partially Immutable
		List<Integer> lst2 = List.of(2, 3, 4, 5, 6, 43, 60, 56, 54, 4, 5, 56, 2); // Immutable

		
		  UnaryOperator<Integer> func = new UnaryOperator<>() {
		  
		  @Override public Integer apply(Integer t) 
		  { return t+20; } };
		 
		lst1.set(0, 2);
		lst1.replaceAll(func);
		System.out.println(lst1);
		lst1.replaceAll(e -> e * 100);
		System.out.println(lst1);
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 > o1 ? 1 : -1;
			}
		};
		//lst1.sort(comparator);
		//lst1.sort((o1, o2) -> (o2 > o1 ? 1 : -1));
		//System.out.println(lst1);
		lst1.sort(Comparator.naturalOrder());
		// lst2.add(234);
		System.out.println(lst1);

		lst.add(123);
		lst.add(234);
		lst.add(343);
		lst.add(212);

		/*
		 * Collections.sort(lst); for (int i:lst) { System.out.println(i); }
		 * 
		 * Collections.reverse(lst);
		 */
		// Anonymous class for interface
		Comparator<Integer> comp1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > o2 % 10)
					return 1;
				return -1;

			}
		};
		// Lambda Expression
		Comparator<Integer> comp = (o1, o2) -> {
			// Using ternary operator
			return o1 % 10 > o2 % 10 ? 1 : -1;

		};
		// Collections.sort(lst);
		// Collections.sort(lst, comp); //using comparator

		// Using anonymous class and lambda
		Collections.sort(lst, (o1, o2) -> {
			// Using ternary operator
			return o1 % 10 > o2 % 10 ? 1 : -1;

		});

		for (int i : lst) {
			// System.out.println(i);
		}
		System.out.println("*****************");
		for (int i = 0; i < lst.size(); i++) {
			// System.out.println(lst.get(i));
		}
		System.out.println("*****************");
		// lst.forEach(System.out::println);
	}

}
