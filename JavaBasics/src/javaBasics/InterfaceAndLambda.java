package javaBasics;


@FunctionalInterface
interface Demo1
{
	int num = 0;			//By default it is final variable
	int calculate(int x);	// Only one Abstract Method
	default void xyz(int z)	//default methods can have body
	{
		System.out.println("I am in 1st Default method in Functional Interface");
	}
	default void mno(int z)
	{
		System.out.println("I am in 2nd Default method in Functional Interface");
	}
	//static methods can also have body
	static void abc() {
		System.out.println("I am in 1st static method in Functional Interface");
	}
	static void def() {
		System.out.println("I am in 2nd static method in Functional Interface");
	}

}

/*class Inter implements Demo1
{

	@Override
	public int calculate(int x) {
		x= x + 10;
		System.out.println("Calculated Number is: "+ x);
		return x;
	}

}*/


public class InterfaceAndLambda {

	public static void main(String[] args) {


		Demo1 in = new Demo1()
		{				//Anonymous inner class

			@Override
			public int calculate(int x) {
				x= x + 10;
				System.out.println("Calculated Number is: "+ x);
				return x;
			}

		};
		Demo1 demo = (int x) -> 		//Lambda expression
				{
				x= x + 2;
				System.out.println("Calculated Number in Lambda is: "+ x);
				return x;
				};

		demo.calculate(5);
		in.calculate(4);
		Demo1.abc();
		Demo1.def();
		in.xyz(0);
		in.mno(0);
	}

}
