package com.pavan;

public class String_pool {
	
	public static void main(String[] args) {
//		String s1 = "Java";
//		String s2 = new String("Java");
		Integer s1 = 10;
		Integer s2 = new Integer(10);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
