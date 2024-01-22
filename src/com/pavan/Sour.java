package com.pavan;

public class Sour {
	public static void main(String[] args) {
		int i = 254673485;
		String s = ""+i;
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}
//		if(sb.reverse().equals(sb)) {
//			System.out.println("Palindrome num");
//		}else {
//			System.out.println("Not a palindrome...");
//		}
//	}

}
