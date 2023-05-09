package javaBasics;

public class WrapperDemo {

	public static void main(String[] args) {

		
		String str = "123";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		int j = 5;	//Primitive datatype
		Integer k = Integer.valueOf(j); //boxing	//Wrapper class
		
		int l = k.intValue();	//unboxing
				
		Integer m = j;		//Auto Boxing
		int n = m;			//auto unboxing
		
		
		
	}

}
