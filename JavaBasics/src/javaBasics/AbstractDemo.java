package javaBasics;

abstract class Human		//Abstract class
{
	public abstract void eat();	//Abstract Method
	
	public void walk()	//Concrete Method
	{
		
	}
}


class Man extends Human			////Concrete Method
{

	@Override
	public void eat() {
		
	}
	
}
class Woman extends Human			////Concrete Method
{

	@Override
	public void eat() {
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		Human obj1 = new Man();		//Runtime Polymorphism
		obj1.eat();

	}

}
