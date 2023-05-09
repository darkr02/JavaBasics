package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingTryWResource {

	public static void main(String[] args) throws Exception {

		BufferedReader br = null;
		int n=0;
		System.out.println("Enter the number: ");
		
		;
		
		try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in)))
		{
			n = Integer.parseInt(br1.readLine());
		}
		
		System.out.println(n);
	}

}
