package interfacePractice;

interface Test{
	void method1();
	void method2();
}

class MyTest implements Test{

	@Override
	public void method1() {
		System.out.println("Method1 of MyTest");
	}

	@Override
	public void method2() {
		System.out.println("Method2 of MyTest");
	}
	
	public void method3() {System.out.println("Method3...");}
}

public class Example1 {
	public static void main(String[] args) {
		Test t = new MyTest();    //It is dynamic method dispatch...
		t.method1();
		t.method2();              //Therefore, Interface achieve runtime polymorphism
	}

}
