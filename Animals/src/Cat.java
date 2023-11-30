
public class Cat extends Animal {
	private String color;
	
	

	public Cat(double length, double heigth, String color) {
		super(length, heigth);
		this.color = color;
	
	}
	@Override
	public String makeNoise() {
		return "Meow, Meow,";
	}
	@Override
	public String toString() {
		return "Cat";
	}

}
