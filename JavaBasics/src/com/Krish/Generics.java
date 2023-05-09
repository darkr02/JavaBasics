package com.Krish;

import java.util.ArrayList;

class Container<T extends Number>
{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public void show()
	{
		System.out.println(value.getClass().getName());
	}
	public void demo(ArrayList<? super T> obj)
	{
		System.out.println(obj.getClass().getName());
	}
	public void demo1(ArrayList<? extends T> obj)
	{
		System.out.println(obj.getClass().getName());
	}
}

public class Generics {

	public static void main(String[] args) {

		Container<Integer> c =  new Container<>();
		c.value=12;
		c.show();
		System.out.println(c.getValue());
		c.demo(new ArrayList<Number>());
		
		Container<Float> c1 =  new Container<>();
		c1.demo1(new ArrayList<Float>());
	}

}
