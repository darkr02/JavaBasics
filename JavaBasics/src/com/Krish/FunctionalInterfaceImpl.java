package com.Krish;

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {

		Printable p = Demo::printSomething;
		p.print();
		Printable p1 = Demo::new;
		p1.print();
	}

}
interface Printable
{
	void print();
}

class Demo
{
	Demo()
	{
		System.out.println("Hello World1");
	}
	static void printSomething()
	{
		System.out.println("Hello World");
	}
}