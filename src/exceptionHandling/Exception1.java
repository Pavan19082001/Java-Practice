package exceptionHandling;

public class Exception1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 0 };
		try {
			int r = arr[1] / arr[0];
			System.out.println(r);

			System.out.println(arr[5]);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
