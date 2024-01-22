package co.methods;

public class MethodOverload3 {
	public static boolean validate(String name) {
		return name.matches("[A-Za-z\\s]+");
	}
	
	public static boolean validate(int age) {
		return age>=3 && age<=15;
	}
	
	public static void main(String[] args) {
		System.out.println(validate("Sai Teja"));
		System.out.println(validate(13));
	}

}
