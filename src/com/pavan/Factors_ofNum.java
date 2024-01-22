package com.pavan;

public class Factors_ofNum {
	public static void main(String[] args) {
		int n = 12;
		
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println(n);
	}
}
