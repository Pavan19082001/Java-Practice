package com.pavan;

public class Palindrome {
	public static void main(String[] args) {
		String str = "2002";
		if (!(str == null || str.length() == 0)) {
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev += str.charAt(i);
			}

			if (str.equals(rev)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a palindrome");
			}
		} else {
			System.out.println("Wrong input");
		}
	}

}
