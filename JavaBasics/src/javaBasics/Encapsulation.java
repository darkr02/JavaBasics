package javaBasics;


//Encapsulation - Binding Data with Methods
class Student
{
	private int rollno;
	private String name;
	
	//getter and setter
	public void setRollno(int r)
	{
		rollno = r;
	}
	public int getRollno()
	{
		return rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setRollno(2);
		System.out.println("st.rollno"+ st.getRollno());
		st.setName("Krish");
		System.out.println("st.Name"+ st.getName());
		
	}

}
