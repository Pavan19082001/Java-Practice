package oops;

class Animal{
	//Multi-level inheritance...
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("Weeping...");
	}
}

public class Inheritance_Challange {
	public static void main(String[] args) {
		BabyDog dog = new BabyDog();
		dog.weep();
		dog.bark();
		dog.eat();
	}

}
