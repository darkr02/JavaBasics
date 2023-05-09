package com.Krish;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class CollectionGenerics {

	public static void main(String[] args) {

		Collection<Object> values = new ArrayList<>();
		values.add(3);
		values.add("Krish");
		values.add(8.9f);
		System.out.println("****Printing Object using iterator****");
		//using Iterator
		Iterator<Object> i = values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//Using advanced for loop
		System.out.println("****Printing Object using advanced for loop****");
		for (Object obj: values)
		{
			System.out.println(obj);
		}
		
		System.out.println("****Printing Integers****");
		Collection<Integer> values1 = new ArrayList<>();
		values1.add(3);
		values1.add(81);
		values1.add(67);
		values1.remove(81);
		for (int j: values1)
		{
			
			System.out.println(j);
		}

	}

}
