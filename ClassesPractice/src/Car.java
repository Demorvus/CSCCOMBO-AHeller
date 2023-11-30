public class Car {
	private String color;
	private int mileage;
	private double amtOfgas;
	private Wheel[] wheels;

	public Car() {
		color = "white";
		mileage = 1000;
		amtOfgas = 30.0;
	}

	public Car(String myColor) {
		this.color = myColor;
	}

	public Car(String myColor, int mileage) {
		color = myColor;
		this.mileage = mileage;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(int radius, String material) {
		for (int i = 0; i < wheels.length; i++) {
		      wheels[i] = new Wheel(radius, material);
		}
		      
	}

	public Car(String myColor, int mileage, double amtOfGas, int numWheels) {
		color = myColor;
		this.mileage = mileage;
		this.amtOfgas = amtOfGas;
		Wheel[] wheels = new Wheel[numWheels];
		
	}

	// Accessors or Getters
	public String getColor() {
		return color;
	}

	public int getMileage() {
		return mileage;
	}

	public double amtOfGas() {
		return amtOfgas;
	}

	public String toString() {
		String str = " Your car is " + this.color + " Your mileage is " + this.mileage + " Your amount of gas is "
				+ this.amtOfgas + "Wheel size: " + this;
		return str;
	}
}