package com.Krish;

public class ExampleTest {
	static int i = 1;
	public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }
	public static void main(String[] args) {
		/*
		 * int i = 0; i = ++i + i; System.out.println("I = " + i);
		 */
		
		/*
		 * String s1 = "Hello"; String s2 = "Hello"; StringBuilder sb1 = new
		 * StringBuilder(); sb1.append("He").append("llo");
		 * System.out.println(s1.equals(s2)); System.out.println(sb1.toString() == s1);
		 */
	   
		
		int a = 7;
        int b = 3;
        ExampleTest.addToInt(a, b);
        System.out.println(a); 
		/*
		 * System.out.println(i + ", "); ExampleTest test = new ExampleTest();
		 * test.myMethod(i); System.out.println(i);
		 */
	    }
	    public void myMethod(int i) {
	        i += 2;
	    }
	

}
