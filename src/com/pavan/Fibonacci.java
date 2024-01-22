package com.pavan;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 1, b = 2, c = 0;
		System.out.println("Enter the number of values ...");
		int n = in.nextInt();
		System.out.print(a+", "+b+", ");
		for(int i=1; i<=n-2; i++) {
			c = a+b;
			System.out.print(c+", ");
			a = b;
			b = c;
		}
		in.close();
	}

}
