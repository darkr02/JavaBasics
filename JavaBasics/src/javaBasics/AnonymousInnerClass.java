package javaBasics;


abstract class E
{
	public abstract void show();
	public abstract void perform();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		E obj1 = new E()
		{
			public void show()
			{
				System.out.println("In new Show");
			}
			public void perform()
			{
				System.out.println("New Performance");
			}

		};
		obj1.show();
		obj1.perform();

	}

}
