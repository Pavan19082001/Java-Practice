package com.pavan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
}

public class Example {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1001, "Ravi", 25000));
		list.add(new Employee(1002, "Pavan", 30000));
		list.add(new Employee(1003, "Kishore", 43000));
		list.add(new Employee(1005, "Arjun", 37000));
		
		//a) Print the Employee Data whose name starts with "A"
		System.out.println("Employee Data whose name starts with A");
		List<Employee> sortedList = list.stream().filter(i -> i.getEmpName().startsWith("A")).collect(Collectors.toList());
		System.out.println(sortedList);
		
		//b) Print the Employee Data whose salary > 25000
		System.out.println("Employee Data whose salary > 25000");
		List<Employee> list2 = list.stream().filter(i -> i.getSalary() > 25000).collect(Collectors.toList());
		System.out.println(list2);
		
		//c) Print the Employee Data whose is earning maximum salary and minimum Salary.
		System.out.println("Employee Data whose is earning maximum salary and minimum Salary");
		Employee maxSalaried = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		Employee minSalaried = list.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Maximum salaried: "+maxSalaried);
		System.out.println("Minimum salaried: "+minSalaried);
		
		//d) Print the Employee Data whose empid = 1005
		System.out.println("Employee Data whose empid = 1005");
		Employee opt = list.stream().filter(i -> i.getEmpId() == 1005).findAny().orElse(null);
		System.out.println(opt);
	}

}
