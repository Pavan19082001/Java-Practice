package com.pavan;

public class DigitsOfNum {
	public static void main(String[] args) {
		int n = 257;
//		while(n>0) { 
//			int r = n%10;
//			n = n/10;
//			System.out.println(r);
//		}
		
		String s = String.valueOf(n);
		char[] a = s.toCharArray();
		for(char ch: a) {
			System.out.print(ch+" ");
		}
	}

}
