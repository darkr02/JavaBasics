package javaBasics;
import java.util.*;
public class VariableLengthArguments {

	public static void main(String[] args) {

		//Calc obj1 = new Calc();
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of the array:");
			int size = sc.nextInt();
			int[] num = new int[size];
			for (int i=0;i<num.length;i++)
			{
				System.out.println("Enter all the integer values to be added in a comma separated way:");
				//System.out.println();
				num[i]= sc.nextInt();
			}
			System.out.println("Array Values are: ");
			System.out.println(Arrays.toString(num));
			/*
			 * for (int j:num) { System.out.print(j); System.out.print(",");
			 * 
			 * }
			 */			
			System.out.println();
			System.out.println("Sum of all the numbers is: "+Calc2.add(num)); 
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println("InputMismatchException...End of Code.");
		}
	
	}

}


class Calc2
{
	public static int add(int ... n)
	{
		int sum = 0;
		for (int i:n)
		{
			sum= sum + i;
		}
		return sum;
	}
}
