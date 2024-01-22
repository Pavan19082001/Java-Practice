package oops;

class Car{
	public void start() {System.out.println("Car is started...");}
	public void accelerate() {System.out.println("Car accerelated");}
	public void changeGear() {System.out.println("gear changed");}
}

class LuxaryCar extends Car{
	public void openRoof() {System.out.println("roof opened");}
	public void changeGear() {System.out.println("Automatic Gear");}
}

public class Overriding2 {
	public static void main(String[] args) {
		Car car = new LuxaryCar();   //Dynamic Method Dispatch...
		car.start();
		car.accelerate();
		car.changeGear();        // method of subclass will be printed
	}

}
