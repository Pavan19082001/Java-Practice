package com.pavan;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		long fact = 1;
//		for(int i=1; i<=n; i++) {
//			fact = fact * i;
//		}
//		System.out.println("Factorial of "+n+" is "+fact);
//		in.close();
		
		System.out.println(factorial(3));
	}
	
	private static int factorial(int n) {
		if(n<0) {
			return -1;
		}
		
		if(n==0 || n==1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
}
