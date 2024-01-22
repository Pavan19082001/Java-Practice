package co.methods;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Integer> {
	
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Integer o) {
		if(age > o) return 1;
		else if(age < o) return -1;
		else return 0;
	}
	
}

public class Comparable_Example {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Nithin", 18));
		list.add(new Student(2, "Varun", 20));
		list.add(new Student(3, "Pavan", 18));
		
		for(Student s: list) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
	}
}
