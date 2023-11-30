
public class Animal {
	private double length;
	private double heigth;

	
	
	
	
	
	
	public Animal(double length, double heigth) {
		super();
		this.length = length;
		this.heigth = heigth;
	}
	public String makeNoise() {
		return "Blah, Blah, Blah";
	}





	@Override
	public String toString() {
		return "Animal";
	}
	
}
