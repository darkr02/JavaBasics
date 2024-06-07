package javaBasics;


class Outer
{
	
	int a;
	public void show()
	{
		
	}
	
	static  class  Inner
	{
		public void display()
		{
			System.out.println("Inner Display");
		}
	}
	
	class  Inner2
	{
		public void display()
		{
			System.out.println("Inner 2 Display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {

		Outer obj1 = new Outer();
		Outer.Inner obj2 = new Outer.Inner();
		Outer.Inner2 obj3 = obj1.new Inner2();
		obj2.display();
		obj3.display();
	}

}
