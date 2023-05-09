package com.Krish;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		values.add(2);
		values.add(12);
		values.add(21);
		values.add(32);
		values.add(22);
		values.add(42);
		Collections.sort(values);
		//values.forEach(System.out::println);		//StreamAPI ... lambda expression
		for (int i:values)
		{
			System.out.println(i);
		}
	}

}
