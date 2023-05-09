package javaBasics;



class Parent2
{
	public void show1()
	{
		System.out.println("In Parent 2 show");
	}
}
class Child2 extends Parent2
{
	@Override
	public void show1()
	{
		System.out.println("In child 2 show");
	}
	
}
class Child3 extends Parent2
{
	@Override
	public void show1()
	{
		System.out.println("In child 3 show");
	}
	
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {

		Parent2 obj1 = new Child2();//Runtime Polymorphism - Dynamic Binding
		obj1.show1();
		obj1 = new Child3();	//DynamicMethodDispatch
		obj1.show1();
	}

}
