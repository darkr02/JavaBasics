package javaBasics;

//We can use Final with variable to make it constant
//we can use final with class to stop inheritance - no one can extend your final class
//we can use FInal with Methods so that no one can override your method

final class calc1
{
	public void show()
	{

	}

}
/*class abc extends calc
{

}*/

class Calculator1
{
	final public void show()
	{
		System.out.println("I am in Calculator show");		
	}

}
class ABC extends Calculator1
{
	public void show1()
	{
		System.out.println("I am in abc show");		

	}

}
public class FinalMethodVariableClass {

	public static void main(String[] args) {

		final int num = 8;
		System.out.println("Final number" + num);
		
		ABC obj =  new ABC();
		obj.show();
	}

}
