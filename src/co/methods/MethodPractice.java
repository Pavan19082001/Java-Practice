package co.methods;

public class MethodPractice {
	
	public void change(int[] arr, int index, int value) {
		arr[index] = value;
	}
	
	public void change2(int x, int value) {
		x = value;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,7};
		int x = 10;
		MethodPractice mp = new MethodPractice();
		mp.change(arr, 4, 25);
		mp.change2(x, 20);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
