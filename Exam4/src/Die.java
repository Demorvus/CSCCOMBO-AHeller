import java.util.Random;
class Die {
	private int numSides;
	private int value;

	public Die() {
		numSides = 6;
		value = 1;
	}

	public Die(int numSides) {
		this.numSides = numSides;
		value = 1;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void roll() {
		Random random = new Random();
		value = random.nextInt(numSides) + 1;
	}

	@Override
	public String toString() {
		return "NumSides: " + numSides + ", Value: " + value;
	}
}