package com.pavan;

import java.util.Scanner;

public class Quadratic_Equation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		double r1, r2;
		System.out.println("Enter the values of a, b, c ");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		r1 = -b+Math.sqrt((b*b)-(4*a*c))/(2*a);
		r2 = -b-Math.sqrt((b*b)-(4*a*c))/(2*a);
		System.out.println("Root1 is "+r1+" & Root2 is "+r2);
		in.close();
	}

}
