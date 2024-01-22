package com.pavan;

import java.util.Scanner;

public class APSeries {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter AP Progressions...");
//		System.out.println("Enter a, d and n values");
//		int a = in.nextInt(), d = in.nextInt(), n = in.nextInt();
//		int term = a;
//		for(int i=1; i<=n; i++) {
//			System.out.print(term+", ");
//			term += d;
//		}
//		in.close();
		
		/* GP Series  */
		System.out.println("Enter GP Progressions...");
		System.out.println("Enter a, r & n values");
		int a = in.nextInt(), r = in.nextInt(), n = in.nextInt();
		int term = a;
		for(int i=1; i<=n; i++) {
			System.out.print(term+",");
			term = term * r;
		}
	}
}
