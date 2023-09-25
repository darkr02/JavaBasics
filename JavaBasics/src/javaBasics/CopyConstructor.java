package javaBasics;

public class CopyConstructor {

	public static void main(String[] args) {
		Car myCar1 = new Car("Nissan", "Rogue");
		Car myCar2 = new Car(myCar1);
		System.out.println(myCar2);
	}
}


class Car{

	String make;
	String model;

	//normal constructor
	public Car(String make, String model)
	{
		this.make = make;
		this.model = model;
	}
	// Copy Constructor
	Car(Car c)
	{
		System.out.println("Copy Constructor Called");
		make = c.make;
		model = c.model;
	}

	@Override
	public String toString()
	{
		return "("+ this.make + " + " + this.model + ")";
	}

}

