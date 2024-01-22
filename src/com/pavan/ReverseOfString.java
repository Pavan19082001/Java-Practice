package com.pavan;

public class ReverseOfString {
	public static void main(String[] args) {
		String str = "Hello World";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
