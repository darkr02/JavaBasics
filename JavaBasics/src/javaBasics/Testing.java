package javaBasics;

interface Computer1{
void compile();	
}

class Laptop1 implements Computer1{

	@Override
	public void compile() {
		System.out.println("Compiling in Laptop");
	}
	
	
	
}

class Desktop1 implements Computer1{
	@Override
	public void compile() {
		System.out.println("Compiling in Desktop");
	}
	
}

class Programmer{
	public void code(Computer1 comp)
	{
		System.out.println("Coding");
		comp.compile();
		for (int i=1;i<10;i++) {
			System.out.println(i);
		}
	}
}
//The Class demonstrates the Loose coupling behavior
public class Testing {
	
	public static void main(String[] args) {
		Laptop1 comp  = new Laptop1();
		Desktop1 comp1  = new Desktop1();
		Programmer pr = new Programmer();
		pr.code(comp);
		System.out.println("abc");
		pr.code(comp1);

	}

	
}
