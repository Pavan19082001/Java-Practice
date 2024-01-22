package com.pavan;

public class Trim_Spaces {
	
	public static void main(String[] args) {
		String s = " Hello World ";
		String res = s.replaceAll(" ", "");
		System.out.print(res);
	}

}
