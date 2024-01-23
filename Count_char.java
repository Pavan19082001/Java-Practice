package com.pavan;

public class Count_char {
	
	public static void main(String[] args) {
		String s = "Strings in java is immutable";
		int count = 0;
		String[] str = s.split(" ");
		
		for(int i=0; i<str.length; i++) {
			String r = str[i];
			count = r.length();
			System.out.println(count);
		}
	}

}
