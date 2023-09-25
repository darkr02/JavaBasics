package com.Krish;

import java.util.ArrayList;
import java.util.List;

public class CalculateExecutionTime {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis(); 
		List <Integer> lst =  new ArrayList<>();
		
		for (int i=0;i<10000000;i++)
		{
			lst.add(i);
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Execution Time in millis: " + (endTime-startTime));
	}

}
