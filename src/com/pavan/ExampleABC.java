package com.pavan;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class EmployeeABC{
	private int eId;
	private String eName;
	private double eSalary;
	
	public EmployeeABC(int eId, String eName, double eSalary) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeABC other = (EmployeeABC) obj;
		return eId == other.eId;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
}

public class ExampleABC {
	
	public static void main(String[] args) {
		Set<EmployeeABC> hs = new HashSet<EmployeeABC>();
		hs.add(new EmployeeABC(101, "Ravi", 46000d));
		hs.add(new EmployeeABC(102, "Kiran", 32000d));
		hs.add(new EmployeeABC(101, "AppaReddy", 50000d));
		
		System.out.println(hs);
	}

}
