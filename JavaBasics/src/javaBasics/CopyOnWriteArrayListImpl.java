package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListImpl {

	public static void main(String[] args) {

		
		//ArrayList<Integer> arList = new ArrayList<>();
		CopyOnWriteArrayList<Integer> arList = new CopyOnWriteArrayList<>();
		arList.add(1);
		arList.add(2);
		arList.add(3);
		arList.add(4);
		arList.add(5);
		arList.add(6);
		arList.add(7);
		arList.add(8);

		/*
		 * List<Integer> arrList=
		 * arList.stream().distinct().sorted().collect(Collectors.toList());
		 * Collections.sort(arrList);
		 */
		
		Iterator<Integer> iter = arList.iterator();
		while(iter.hasNext())
		{
			if(iter.next().equals(5))
			{
				arList.add(9);
			}
		}
		
		//arList.forEach(i->System.out.println(i));
		arList.forEach(System.out::println);

	}

}
