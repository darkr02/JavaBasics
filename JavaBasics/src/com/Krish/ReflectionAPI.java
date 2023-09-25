package com.Krish;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class B
{
	
}
class A extends B
{
	
	public String abc(String name)
	{
		return "My Name is: " + name;
	}
}

public class ReflectionAPI {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> c = Class.forName("com.Krish.A");
		//System.out.println(c.getSuperclass());
		//System.out.println(c.isInterface());
		Method method = c.getMethod("abc", String.class);
		Method[] m = c.getClass().getDeclaredMethods();
		for (Method name : m)
		{
			System.out.println("Method Name: "+name);
		}
		@SuppressWarnings("deprecation")
		Object obj = c.newInstance();
		String output = (String) method.invoke(obj, "Krishnendu");
		System.out.println("Output: "+ output);
		

	}

}
