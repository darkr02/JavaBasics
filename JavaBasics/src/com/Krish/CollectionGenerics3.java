package com.Krish;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionGenerics3 {

	public static void main(String[] args) {

		List<Student2> studs = new ArrayList<>();
		studs.add(new Student2(1,85));
		studs.add(new Student2(2,15));
		studs.add(new Student2(3,25));
		studs.add(new Student2(4,65));
		studs.add(new Student2(5,45));
		Collections.sort(studs);
		
		for(Student2 s: studs)
		{
			System.out.println(s);
		}
	}

}


class Student2 implements Comparable<Student2>
{
	int rollno;
	int marks;
	
	Student2(int r, int m)
	{
		this.rollno = r;
		this.marks = m;
	}

	@Override
	public String toString() {
		return "Student2[rollno=" + rollno + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student2 s) {

		return this.marks>s.marks?1:-1;
	}
	
	
}
