package oops;

import java.util.Date;

class Student1{
	private String rollNo;
	private static int count = 1;       // global variable or class variable
	//constructor
	public Student1() {
		rollNo = generateRollNo();
	}
	private String generateRollNo() {
		Date d = new Date();
		String str = "Univ-"+(d.getYear()+1900)+"-"+count;
		count++;
		return str;
	}
	//getters
	public String getRollNo() {
		return rollNo;
	}
}

public class Static_Example {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		System.out.println(s1.getRollNo());
		System.out.println(s2.getRollNo());
		System.out.println(s3.getRollNo());
		
	}

}
