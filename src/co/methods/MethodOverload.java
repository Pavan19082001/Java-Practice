package co.methods;

public class MethodOverload {
	//Example for method overloading...
	//area of a rectangle
	public static int area(int l, int b) {
		return l*b;
	}
	//area of a circle
	public static void area(float r) {
		double d = Math.PI*r*r;
		System.out.format("%.2f", d);
	}
	public static void main(String[] args) {
		System.out.println(area(25, 30));
		area(120);
	}

}
