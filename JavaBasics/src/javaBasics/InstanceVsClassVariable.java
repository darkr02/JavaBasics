package javaBasics;

public class InstanceVsClassVariable {

	public static void main(String[] args) {


		Circle c = new Circle((byte) 6);
		float area1 = c.area();
		System.out.println("Area of the circle is:"+ area1);
		Circle b = new Circle((byte) 5);
		float area2 = b.area();
		System.out.println("Area of the circle is:"+ area2);
		System.out.println("PI value is:"+ Circle.PI);
		boolean a = (area1>area2?true:false);
		System.out.println(a);
	}


}


final class Circle{
	public static final float PI = 3.14f;  //Class Variable 
	private byte radius;  //Instance Variable
	public Circle(byte r)	//Constructor
	{
		this.radius=r;

	}
	public float area()	//method
	{
		float area;		//local variable
		area = PI *radius*radius;
		return area;

	}

}