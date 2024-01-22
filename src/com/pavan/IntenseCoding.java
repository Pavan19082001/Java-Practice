package com.pavan;

import java.util.Arrays;
import java.util.Scanner;

public class IntenseCoding {
	static void sumAbsMin(int[] a, int[] b, int[] c) {

		int x = 0, y = 0, z = 0;
		int i = a.length;
		int j = b.length;
		int k = c.length;
		int ans = Integer.MAX_VALUE;

		int[] temp = new int[3];
		int minAns = Integer.MAX_VALUE;
		while (x < i) {
			while (y < j) {
				while (z < k) {
					ans = Math.min(ans, (Math.abs(a[x] - b[y]) + Math.abs(b[y] - c[z]) + Math.abs(c[z] - a[x])));
					if (ans < minAns) {
						temp[0] = a[x];
						temp[1] = b[y];
						temp[2] = c[z];
						minAns = ans;
					}
					z++;
				}
				y++;
				z = 0;
			}
			x++;
			y = 0;
		}
		for (int a1 = 0; a1 < 3; a1++) {
			System.out.println("arr" + a1 + " = " + temp[a1]);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arr1...");
		int arr1[] = new int[sc.nextInt()];
		System.out.println("Enter the values of arr1");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of arr2...");
		int arr2[] = new int[sc.nextInt()];
		System.out.println("Enter the values of arr2");
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = sc.nextInt();
		}
		System.out.println("Enter the size of arr3...");
		int arr3[] = new int[sc.nextInt()];
		System.out.println("Enter the values of arr3");
		for (int k = 0; k < arr3.length; k++) {
			arr3[k] = sc.nextInt();
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);

		sumAbsMin(arr1, arr2, arr3);

	}

}
