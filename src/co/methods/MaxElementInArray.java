package co.methods;

public class MaxElementInArray {
	public static int max(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr = {23, 11, 67, 34, 93, 109};
		System.out.println(max(arr));
	}

}
