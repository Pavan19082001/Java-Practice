package com.pavan;

import java.util.ArrayList;
import java.util.List;

class Emp{
	private String name;
	private double age;
	private double salary;
	
	public Emp() {};
	
	public Emp(String name, double age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
public class Employee {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp("Ravi Teja", 31, 25000));
		list.add(new Emp("Sai", 26, 20000));
		list.add(new Emp("Vinay Patel", 21, 40000));
		//output...
		list.stream().filter(emp -> emp.getAge() > 25).
				map(emp->emp.getSalary() + (emp.getSalary()*10)/100).forEach(System.out::println);
	}
}
