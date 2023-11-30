
public class Person {
	private String fName;
	private String lName;
	private int Age;
	private double heightInches;

	public Person(String fName, String lName, int Age, double heightInches) {
		this.fName = fName;
		this.lName = lName;
		this.Age = Age;
		this.heightInches = heightInches;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getHeightInches() {
		return heightInches;
	}

	public void setHeightInches(double heightInches) {
		this.heightInches = heightInches;
	}

	public String toString() {
		return "Hi " + fName + " " + lName + ". Your age is " + Age + ". Your height is "
				+ this.heightInches + " inches.";
	}
}