package oops;

abstract class Shape{
	abstract public void perimeter();
	abstract void area();
}

class Circle1 extends Shape{
	
	// fields
	private double radius;

	// Getters and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void perimeter() {
		System.out.print("Perimeter of a circle is ");
		System.out.printf("%.3f", 2*Math.PI*radius);
	}

	@Override
	void area() {
		System.out.print("Area of a circle is ");
		System.out.printf("%.3f", Math.PI*radius*radius);
		System.out.println("");
	}
	
}

class Rectangle1 extends Shape{
	
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of a rectangle is "+2*(length+breadth));
	}

	@Override
	void area() {
		System.out.println("Area of a recatangle is "+(length*breadth));
	}
	
}

public class AbstractExample2 {
	public static void main(String[] args) {
		Rectangle1 c = new Rectangle1();
		//Input 
		c.setLength(20);
		c.setBreadth(25);
		c.area();
		c.perimeter();
		
		Circle1 s = new Circle1();
		s.setRadius(7);
		s.area();
		s.perimeter();
	}

}
