package javaBasics;

public class multipleClasses {

	public static void main(String[] args) {

		A obj1=new A();
		B obj2=new B();

		obj1.start();
		obj2.start();


	}
}


class A extends Thread
{
	public void run() {
		for(int i=30;i>=1;i--)
		{
			System.out.println("Krish");
		}
	}
}
class B extends Thread
{
	public void run() {
		for(int i=30;i>=1;i--)
		{
			System.out.println("Daripa");
		}
	}
}