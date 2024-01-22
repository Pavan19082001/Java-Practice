package oops;

class Student{
	public int rollNo;
	public String name;
	public String course;
	public int m1, m2, m3;
	
	public int total() {
		return m1+m2+m3;
	}
	
	public float average() {
		return (float)total()/3;
	}
	
	public char grade() {
		if(average()>90) {
			return 'O';
		}else if(average()>80 && average()<90) {
			return 'S';
		}else if(average()>70 && average()<80) {
			return 'A';
		}else if(average()>60 && average()<70) {
			return 'B';
		}else if(average()>50 && average()<60) {
			return 'C';
		}
		return 'F';
	}
	
	public String details() {
		return "Roll No. :"+rollNo+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student std = new Student();
		std.rollNo = 29707453;
		std.name = "Vinodh Kumar";
		std.course = "CIVIL";
		std.m1 = 94;
		std.m2 = 69;
		std.m3 = 87;
		System.out.println(std.details());
		System.out.println("Total Subject marks: "+std.total());
		System.out.println("Average marks: "+std.average());
		System.out.println("Grade: "+std.grade());
	}

}
