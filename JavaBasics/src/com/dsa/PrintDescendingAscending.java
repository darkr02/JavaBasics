package com.dsa;
import java.io.*;
import java.util.*;

public class PrintDescendingAscending {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: "); 
		int n = sc.nextInt();
		printDescAsc(n);
		sc.close();
		
		
	}
	
	public static void printDescAsc(int n)
	{
		if (n==0)
		{
			return;
		}
			System.out.println(n);
			printDescAsc(n-1);
			System.out.println(n);
		
	}

}
