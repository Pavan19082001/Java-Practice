package com.pavan;

import java.util.Scanner;

public class Magic_Number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if((n-1)%9 == 0) {
			System.out.println("It's magical number...");
		}else {
			System.out.println("Not a magical number !");
		}
	}
}
