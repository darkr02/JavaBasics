package javaBasics;

//We can use Final with variable to make it constant
//we can use final with class to stop inheritance - no one can extend your final class
//we can use FInal with Methods so that no one can override your method

final class calc1
{
	public void show()
	{
		System.out.println("I am in Final Class Calculator show");
	}

}
/*class abc extends calc
{

}*/

class Calculator1
{
	final public void show()
	{
		System.out.println("I am in Calculator Final Method show");		
	}

}
class ABC extends Calculator1
{
	public void show1()
	{
		System.out.println("I am in abc show");		

	}
	/*
	 * @Override public void show() {
	 * 
	 * }
	 */
}
public class FinalMethodVariableClass {

	public static void main(String[] args) {

		final int num = 8;
		//num = 9;
		System.out.println("Final number" + num);
		
		calc1 calcObj = new calc1();
		ABC obj =  new ABC();
		obj.show();
		calcObj.show();
	}

}
