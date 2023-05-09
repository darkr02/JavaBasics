package com.Krish;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_Sort_Anonymous_Lambda {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();

		lst.add(123);
		lst.add(234);
		lst.add(343);
		lst.add(212);

		/*Collections.sort(lst);
		for (int i:lst)
		{
			System.out.println(i);
		}

		Collections.reverse(lst);*/
		//Anonymous class for interface
		Comparator<Integer> comp1 = new Comparator<Integer>() 
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				if (o1%10>o2%10)
					return 1;
				return -1;

			}
		};
		//Lambda Expression
		Comparator<Integer> comp = (o1, o2) ->  
		{
			//Using ternary operator
			return o1%10>o2%10?1:-1;

		};
		//Collections.sort(lst);
		//Collections.sort(lst, comp); 	//using comparator 
		
		//Using anonymous class and lambda
		Collections.sort(lst, (o1, o2) ->  
		{
			//Using ternary operator
			return o1%10>o2%10?1:-1;

		});
		
		for (int i:lst)
		{
			System.out.println(i);
		}
	}

}
