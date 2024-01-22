package com.pavan;

public class Reverse_Of_Num {
	public static void main(String[] args) {
		int n = 2002, r;
		int m = n;
		int rev = 0;
		while(n>0) {
			r = n%10;
			n = n/10;
			rev = rev*10+r;
		}
		System.out.println(rev);
		//Palindrome num...
		if(rev == m) {
			System.out.println("Its a palindrome num");
		}else {
			System.out.println("Not a palindrome num");
		}
	}

}
