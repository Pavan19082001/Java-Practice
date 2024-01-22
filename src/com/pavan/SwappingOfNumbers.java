package com.pavan;

import java.util.Scanner;

public class SwappingOfNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any two values of a, b...");
		int a = in.nextInt();  int b = in.nextInt();
		System.out.println("Before swapping: "+a+" "+b);
		b = b-a;
		a = b+a;
		b = a-b;
		System.out.println("After swapping: "+a+" "+b);
		in.close();
	}

}
