package co.methods;

import java.util.Arrays;
import java.util.Collections;

public class MethodOverload2 {
	// Primitive data type passing...
	public static int reverse(int n) {
		String str = "";
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			str = str + r;
		}
		int rev = Integer.parseInt(str);
		return rev;
	}
	// Object parsing...
	public static void reverse(Integer[] arr) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}

	public static void main(String[] args) {
		Integer[] arr = {2,3,4,5,6};
		try {
			System.out.println(reverse(237));
		    reverse(arr);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
