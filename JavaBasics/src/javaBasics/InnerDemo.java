package javaBasics;


class outer
{
	
	int a;
	public void show()
	{
		
	}
	
	static  class  inner
	{
		public void display()
		{
			System.out.println("Inner Display");
		}
	}
	
	class  inner2
	{
		public void display1()
		{
			System.out.println("Inner 2 Display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {

		outer obj1 = new outer();
		outer.inner obj2 = new outer.inner();
		outer.inner2 obj3 = obj1.new inner2();
		obj2.display();
		obj3.display1();
	}

}
