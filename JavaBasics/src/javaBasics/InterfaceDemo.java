package javaBasics;

interface computer
{
	void code();
}


class developer
{
	public void devApp(computer comp)
	{
		comp.code();
	}
	
}

class laptop implements computer
{
	public void code()
	{
		System.out.println("code, compile & run");
	}
}

class desktop implements computer
{
	public void code()
	{
		System.out.println("code, compile & run. Faster.");
	}

}


public class InterfaceDemo {
	public static void main(String[] args) {

		computer lap = new laptop();
		@SuppressWarnings("unused")
		computer desk = new desktop();
		
		
		developer dev = new developer();
		dev.devApp(lap);
		
	}
}
