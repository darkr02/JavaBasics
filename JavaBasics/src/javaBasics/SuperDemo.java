package javaBasics;

class Parent 
{
	public Parent()
	{
		System.out.println("I am in Parent");
	}
	public Parent(int i)
	{
		System.out.println("I am in Parent 2");
	}
}

class Child extends Parent
{
	
	public Child()
	{
		
		System.out.println("I am in Child");
	}
	public Child(int i)
	{
		super(i);
		System.out.println("I am in Child 2");
	}
}

public class SuperDemo {

	public static void main(String[] args) {

		Child obj1 = new Child();
		Child obj2 = new Child(1);
		//Parent pObj = new Parent();
		//Parent pObj1 = new Parent(2);
	}

}
