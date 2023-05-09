package com.Krish;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		System.out.println("The vectors memory capacity is: "+v.capacity()); 
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(11);
		System.out.println("Elements of the vector are");
		for (int i:v)
		{
			System.out.println(i);
		}
		List<Integer> lst = new ArrayList<>();
		System.out.println("Array list size is: "+lst.size());
		lst.add(1);
		System.out.println("After adding one item Array list size is: "+lst.size());
		List<Integer> lst1 = new LinkedList<>();
		
		System.out.println("Linked list size is: "+lst1.size());
		
		
		System.out.println("The vectors memory capacity changed to: "+v.capacity());
		System.out.println("Vector size is: "+v.size());
		
	}

}
