package oops;

class Coffee{
	private float coffeePowderQty;
	private float waterQty;
	private float milkQty;
	private float sugarQty;
	
	static private Coffee coffee = null;
	
	private Coffee() {
		coffeePowderQty = 1;
		waterQty = 1;
		milkQty = 1;
		sugarQty = 1;
	}
	
	public float getCoffeePowderQty() {
		return coffeePowderQty;
	}
	public void setCoffeePowderQty(float coffeePowderQty) {
		this.coffeePowderQty = coffeePowderQty;
	}
	public float getWaterQty() {
		return waterQty;
	}
	public void setWaterQty(float waterQty) {
		this.waterQty = waterQty;
	}
	public float getMilkQty() {
		return milkQty;
	}
	public void setMilkQty(float milkQty) {
		this.milkQty = milkQty;
	}
	public float getSugarQty() {
		return sugarQty;
	}
	public void setSugarQty(float sugarQty) {
		this.sugarQty = sugarQty;
	}
	
	static Coffee getInstance() {
		if(coffee == null) {
			coffee = new Coffee();
		}
		return coffee;
	}
}

public class CoffeeMachine {
	public static void main(String[] args) {
		Coffee c1 = Coffee.getInstance();
		Coffee c2 = Coffee.getInstance();
		Coffee c3 = Coffee.getInstance();
		System.out.println(c1+" "+c2+" "+c3);
	}

}
