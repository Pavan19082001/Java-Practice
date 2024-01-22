package co.methods;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean prime(int x) {
		if(x==0||x==1) {
			return false;
		}
		for(int i=2, limit = x/2; i<=limit; i++) {
			if(x%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any value...");
		int n = in.nextInt();
		System.out.println(prime(n));
		in.close();
		
	}

}
