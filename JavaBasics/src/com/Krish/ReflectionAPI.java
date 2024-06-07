package com.Krish;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class B
{
	public B() {} 
}
class A extends B
{
	public A(){}
	
	public String abc(String name)
	{
		return "My Name is: " + name;
	}
	private void show(String name)
	{
		System.out.println("My show name is: "+name);
	}
}

public class ReflectionAPI {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		

		
		Class<?> c1 = Class.forName("com.Krish.A");
		A a = (A) c1.newInstance();
		
		Method m = c1.getDeclaredMethod("show", String.class);
		m.setAccessible(true);
		m.invoke(a,"Funambulist");
		
		
		
		/*
		 * Class<?> c = Class.forName("com.Krish.A");
		 * System.out.println(c.getSuperclass()); System.out.println(c.isInterface());
		 * Method[] meth = c.getMethods(); for (Method name : meth) {
		 * System.out.println("Method Names: "+name.getName()); } Method method =
		 * c.getMethod("abc", String.class); Method[] m =
		 * c.getClass().getDeclaredMethods(); for (Method name : m) {
		 * System.out.println("Method Name: "+name.getName()); }
		 * 
		 * @SuppressWarnings("deprecation") Object obj = c.newInstance(); String output
		 * = (String) method.invoke(obj, "Krishnendu"); System.out.println("Output: "+
		 * output);
		 */		

	}

}
