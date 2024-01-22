package com.pavan;

public class Main {
	public static void main(String[] args) {
		String s = "9876";
		int i = Integer.parseInt(s);
		while(i>0) {
			int r = i%10;
			System.out.println(r);
			i = i/10;
		}
	}

}
