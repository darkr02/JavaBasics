package javaBasics;


@SuppressWarnings("serial")
class KrishException extends Exception
{

	public KrishException(String s) 
	{
		super(s);
	}
	
}
public class ExceptionHandlingThrow {

	public static void main(String[] args) {

		
		int i=9;
		int j=10;
		try {
			j=i/j;
			if (j==0)
			{
				throw new KrishException("Inside Krish");
			}
		}
		catch(KrishException e)
		{
			System.out.println("Value defaulted."+e);
			j=9;
			System.out.println("Defaulted Value is:"+j);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero"+e);
		}
		catch(Exception e)
		{
			System.out.println("Divide by Zero");
		}
		
			
	}

}
