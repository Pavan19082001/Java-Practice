package com.pavan;

public class Reverse_Char_InString {
	public static void main(String[] args) {
		String str = "I am Developer";
		String[] s = str.split(" ");
		
		for(int i=0; i<s.length; i++) {
			String r = s[i];
			StringBuilder sb = new StringBuilder(r);
			System.out.print(sb.reverse()+" ");
		}
	}
}
