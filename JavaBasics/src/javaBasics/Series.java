package javaBasics;

public class Series {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		/*
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		for(int k=5;k>=1;k--)
		{
			for(int l=1;l<=k;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		/*
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 */
		for(int k=1;k<=5;k++)
		{
			for(int l=5;l>=k;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
