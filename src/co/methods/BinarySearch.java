package co.methods;

class ExampleSearch{
	public static int BinarySearch(int[] arr, int x) {
		int l = 0, r = arr.length-1;
		while(l<=r) {
			int m = l + (r-l)/2;
			
			if(arr[m] == x) return m;
			
			if(arr[m] < x) l = m+1;
			
			if(arr[m] > x) r = m-1;
		}
		return -1;
	}
}

public class BinarySearch {
	public static void main(String[] args) {
		ExampleSearch obj = new ExampleSearch();
		int[] arr = {1, 4, 5, 10, 11, 12};
		int x = 11;
		
		int res = obj.BinarySearch(arr, x);
		
		if(res == -1) { 
			System.out.println("Element is not present in the array");
		}else {
			System.out.println("Element is present at the index "+res);
		}
	}
}
