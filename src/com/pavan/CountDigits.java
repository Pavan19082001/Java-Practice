package com.pavan;

public class CountDigits {
	public static void main(String[] args) {
		int n = 245967;
		int count = 0;
//		int count = String.valueOf(n).length();
//		System.out.println(count);
		
		while(n>0) {
			int r = n%10;
			n = n/10;
			count++;
		}
		System.out.println(count);
	}
}
