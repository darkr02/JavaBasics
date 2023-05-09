package javaBasics;

public class ExceptionHandling {

	public static void main(String[] args) {

		try{
			int[] arr = new int[3];
			int[] arr1 = null;
			arr1[1]= 6;
			arr[2] = 9;
			int j = 9;
			int k = 0;
			int i =j/k;
			
			System.out.println("Output is: "+i);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("Bye");

		}
	}

}
