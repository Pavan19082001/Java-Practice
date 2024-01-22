package exceptionHandling;

import java.util.Scanner;

class LowBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Balance should not be less than 5000...";
	}
}

public class ClassException {
	public static void main(String[] args) throws LowBalanceException {
		Scanner in = new Scanner(System.in);
		int balance = in.nextInt();
		in.close();

		if (balance > 5000) {
			System.out.println("You have enough balance...");
		} else {
			throw new LowBalanceException();
		}
	}

}
