package com.Krish;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArrayList {

	public static void main(String[] args) {

		
		List<String> names = new ArrayList<>();
		names.add("Krish");
		names.add("Sandeep");
		names.add("Mithun");
		names.add("Sandeep");
		names.add("Krish");
		
		Set<String> namesInSet = new HashSet<>();
		System.out.println("Duplicate Values Are:");
		for (String name: names)
		{
			if (namesInSet.add(name)==false)
			System.out.println(name);
		}
		
		
		for( String name: namesInSet)
		{
			System.out.println("In Set:"+ name);
		}
	}

}
