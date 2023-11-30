
public class Horse extends Animal{
	private double speed;

	
	public Horse(double length, double heigth, double speed) {
		super(length, heigth);
		this.speed = speed;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String makeNoise() {
		return "Nah, Nah";
	}
	@Override
	public String toString() {
		return "Horse";
	}


}

