package com.pavan;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c values...");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		float s = (a*b*c)/2f;
		float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the triangle is "+area);
		in.close();
		
	}

}
