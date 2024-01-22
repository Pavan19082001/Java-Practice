package com.pavan;

public class Prime {
	public static void main(String[] args) {
		for(int i=2; i<=30; i++) {
			boolean isPrime = true;
			for(int j=2, limit = i/2; j<=limit; j++) {
				if(i%j == 0)
					isPrime = false;
				    break;
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}

}
