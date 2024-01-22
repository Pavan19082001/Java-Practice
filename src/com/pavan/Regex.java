package com.pavan;

public class Regex {
	public static void main(String[] args) {
		int b = 10110011;
		String str = String.valueOf(b);
		System.out.println(str.matches("[01]+"));
	}

}
