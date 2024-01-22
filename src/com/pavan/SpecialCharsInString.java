package com.pavan;

public class SpecialCharsInString {
	public static void main(String[] args) {
		String s = "java@#25%off";
		System.out.println(s.replaceAll("[^A-Za-z0-9]", ""));
	}
}
