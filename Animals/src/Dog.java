
public class Dog extends Animal{
	private boolean drool;

	public Dog(double length, double heigth, boolean drool) {
		super(length, heigth);
		this.drool = drool;
		
	}
	@Override
	public String makeNoise() {
		return "woof, woof";
	}

	@Override
	public String toString() {
		return "Dog [drool=" + drool + "]";
	}
	

}
