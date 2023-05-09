package com.Krish;

interface MobileCompany
{
	String APPLE = "Apple";
}

enum Mobile
{
	APPLE(100),SAMSUNG(90),HTC(87);
	
	int price;
	
	Mobile(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
}
public class EnumDemo implements MobileCompany{

	public static void main(String[] args) {

		System.out.println(MobileCompany.APPLE);
		System.out.println(Mobile.APPLE);
		System.out.println(Mobile.APPLE.getPrice());
		Mobile m = Mobile.SAMSUNG;
		switch(m)
		{
			case APPLE:
				System.out.println("The Best");
				break;
			case SAMSUNG:
				System.out.println("The Good");
				break;
			case HTC:
				System.out.println("The Better");
				break;
			default:
				System.out.println("All are good");
				break;
				
		}
	}

}
