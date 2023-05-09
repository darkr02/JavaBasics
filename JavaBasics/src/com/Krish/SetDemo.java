package com.Krish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> sets = new HashSet<>();
		System.out.println(sets.add(1));
		System.out.println(sets.add(2));
		System.out.println(sets.add(8));
		System.out.println(sets.add(2));
		System.out.println(sets.add(null));
		System.out.println(sets.add(null));
		System.out.println(sets.add(null));
		
		//System.out.println(sets.remove(null));

		System.out.println(sets);
		
		List <Integer> lst = new ArrayList<>(sets);
		System.out.println(lst.add(null));
		System.out.println(lst.add(null));
		System.out.println(lst.add(null));
		System.out.println(lst);
		while(lst.remove(null)) {}
		lst.add(2);
		lst.add(7);
		System.out.println(lst);
		Set<Integer> sets2 = new HashSet<>(lst);

		System.out.println(sets2);
	}

}
