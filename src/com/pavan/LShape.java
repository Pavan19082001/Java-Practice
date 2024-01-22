package com.pavan;

public class LShape {
	public static void main(String[] args) {
		for(int i=0; i<6; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0||i==5) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
