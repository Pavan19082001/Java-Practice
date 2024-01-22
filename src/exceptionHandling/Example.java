package exceptionHandling;

//Palindrome count of substrings...
public class Example {
	public static void main(String[] args) {
		int count = 0;
		String str = "aba";
		for(int i=0; i<str.length(); i++) {
			for(int j=str.length()-1; j>=0; j--) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
