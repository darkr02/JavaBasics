package javaBasics;


class Calculator2 		//super, parent
{

	public int add(int x, int y)
	{
		return x+y;
	}
}

class CalcAdv extends Calculator2		//child, sub
{
	public int sub(int x, int y)
	{
		return x-y;
	}
}

class CalcVeryAdv extends CalcAdv		//child, sub
{
	public int multi(int x, int y)
	{
		return x*y;
	}
}

public class Inheritance {

	public static void main(String[] args) {

		CalcVeryAdv obj1 = new CalcVeryAdv();
		System.out.println(obj1.add(2, 3));
		System.out.println(obj1.sub(5, 2));
		System.out.println(obj1.multi(5, 2));
	}

}
