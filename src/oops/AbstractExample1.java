package oops;

abstract class Supper {
	public Supper() {
		System.out.println("Super class Constructor");
	}

	public void method1() {
		System.out.println("Method1 of super class");
	}

	abstract public void method2();
}

class Subb extends Supper {

	@Override
	public void method2() {
		System.out.println("Method2 of sub class");
	}

}

public class AbstractExample1 {
	public static void main(String[] args) {
		Supper sup = new Subb();
		sup.method1();
		sup.method2();
	}

}
