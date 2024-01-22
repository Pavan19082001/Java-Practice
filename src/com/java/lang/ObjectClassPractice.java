package com.java.lang;

class MyObject{
	public String toString() {
		return "My Object";
	}
	
	public int hashcode() {
		return 100;
	}
	
	public boolean equals(Object o) {
		return this.hashcode() == o.hashCode();
	}
}

public class ObjectClassPractice {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = o1;
		MyObject obj = new MyObject();
		System.out.println(o1.equals(o2));
		System.out.println(o1.getClass());
		System.out.println(obj.toString());
	}

}
