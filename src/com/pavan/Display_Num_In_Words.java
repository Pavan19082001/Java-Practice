package com.pavan;

public class Display_Num_In_Words {
	public static void main(String[] args) {
		int n = 2567;
		char[] str = String.valueOf(n).toCharArray();
		for (int i = str.length - 1; i >= 0; i--) {
			char c = str[i];
			switch (c) {
			case '0':
				System.out.println("Zero");
				break;
			case '1':
				System.out.println("One");
				break;
			case '2':
				System.out.println("Two");
				break;
			case '3':
				System.out.println("Three");
				break;
			case '4':
				System.out.println("Four");
				break;
			case '5':
				System.out.println("Five");
				break;
			case '6':
				System.out.println("Six");
				break;
			case '7':
				System.out.println("Seven");
				break;
			case '8':
				System.out.println("Eight");
				break;
			case '9':
				System.out.println("Nine");
				break;
			}
		}
	}

}
