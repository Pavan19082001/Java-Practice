package com.pavan;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = n;
		int sum = 0;
		int r;
		while (n > 0) { 
			r = n % 10;
			sum += r * r * r;
			n = n / 10; 
		}
		if (sum == m) {
			System.out.println("Its a Armstrong number...");
		} else {
			System.out.println("Not a Armstrong number!");
		}
		in.close();
	}

}
