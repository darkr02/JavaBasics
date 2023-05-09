package javaBasics;

public class StringOperation {

	public static void main(String args[])	{
		
		int a[] = new int[4]; 
		try
		{
			for (int j=0;j<4;j++)
			{
				a[j]= j;
			}
			for (int i: a)
			{
				System.out.println("numbers in array:"+i);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error. ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Error. unchecked runtime exception.");
			
		}
		finally
		{
			System.out.println("Finally block.");
		}

	}

}
