public class Course {
	private String courseName;
	private int numStudents;
	private int maxStudents;
	private int credits;
	private String room;

	public Course() {
	}

	public Course(String courseName, int numStudents, int maxStudents, String room) {
		this.courseName = courseName;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.room = room;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String dbString() {
        return  "Course" + "," + courseName  + "," + maxStudents + "," + numStudents + "," + room;
    }

	@Override
	public String toString() {
		return "Course Name: " + courseName + "\n" + "Number of Students: " + numStudents + "\n" + "Max Students: "
				+ maxStudents + "\n" + "Credits: " + credits + "\n";
	}
}
