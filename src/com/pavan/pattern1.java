package com.pavan;

public class pattern1 {
	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}

		// Pattern 2...
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println(" ");
//		}

		// Pattern 3...
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(i + j + " ");
//			}
//			System.out.println(" ");
//		}
		
		// Pattern 4
//		int count = 0;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.format("%02d", ++count);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
		
		// Pattern 5
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println(" ");
//		}
		
		// Pattern 6
//		int count = 0;
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.format("%02d", ++count);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
		
		// Pattern 7
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i+1; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		// Pattern 8
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j > 5) {
					System.out.format("%2s", '*');
				}else {
				    System.out.format("%2s", "-");
				}
			}
			System.out.println("");
		}
	}

}
