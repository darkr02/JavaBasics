package com.Krish;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionGenerics2 {

	public static void main(String[] args) {

		List<Student1> studs = new ArrayList<>();
		studs.add(new Student1(1,85));
		studs.add(new Student1(2,15));
		studs.add(new Student1(3,25));
		studs.add(new Student1(4,65));
		studs.add(new Student1(5,45));
		Collections.sort(studs, (s1,s2) ->
		{
			return s1.marks<s2.marks?1:-1;
		});
		
		System.out.println("****Printing students details with marks in descening order****");
		for(Student1 s: studs)
		{
			System.out.println(s);
		}
	}

}


class Student1
{
	int rollno;
	int marks;
	
	Student1(int r, int m)
	{
		this.rollno = r;
		this.marks = m;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	
}
