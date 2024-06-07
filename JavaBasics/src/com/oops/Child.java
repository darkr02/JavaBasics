package com.oops;

public class Child extends Parent{

	public void method1() 
	{
		System.out.println("In child method");
	}
	
	public static void main(String[] args) {
		Parent child = new Child();
		child.method1();
	}
}
