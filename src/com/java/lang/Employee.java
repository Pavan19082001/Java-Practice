package com.java.lang;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Employee {
	private String emp_name;
	private double salary;
	private LocalDate hiring_date;
	
	public Employee(String emp_name, double salary, LocalDate hiring_date) {
		this.emp_name = emp_name;
		this.salary = salary;
		this.hiring_date = hiring_date;
	}

	//Getters & Setters...
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHiring_date() {
		return hiring_date;
	}

	public void setHiring_date(LocalDate hiring_date) {
		this.hiring_date = hiring_date;
	}
	
	//Method to get years of experience of an employee...
	public void getExperience() {
		Period p = Period.between(hiring_date, LocalDate.now());
		System.out.println(p.getYears()+"."+p.getMonths()+" years of experience");
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Pavan", 30000, LocalDate.of(2022, Month.SEPTEMBER, 29));
		
		System.out.print(emp1.emp_name+" has ");
		emp1.getExperience(); 
		
		Employee emp2 = new Employee("Ravi Kumar", 18000, LocalDate.of(2021, Month.AUGUST, 18));
		
		System.out.print(emp2.emp_name+" has ");
		emp2.getExperience();
		
		Employee emp3 = new Employee("Stephen", 45000, LocalDate.of(2023, Month.MARCH, 24));
		
		System.out.print(emp3.emp_name+" has ");
		emp3.getExperience();
		
	}
	
}
