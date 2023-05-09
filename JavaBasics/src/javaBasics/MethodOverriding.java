package javaBasics;


class Parent1
{
	public void show()
	{
		System.out.println("in Parent show");
	}

	
}
class Child1 extends Parent1
{
	@Override
	public void show()
	{
		super.show();
		System.out.println("in Child show");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {

		Child1 obj1 = new Child1();
		obj1.show();
	}

}
