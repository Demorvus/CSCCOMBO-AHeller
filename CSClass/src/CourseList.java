import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseList {
	private List<Course> courses;

	public CourseList() {
		courses = new ArrayList<>();
		courses.add(new Course("CSC 101", 20, 30, 3));
		courses.add(new Course("CSC 202", 15, 25, 4));
		courses.add(new Course("CSC 303", 25, 35, 5));
		courses.add(new Course("CSC 404", 18, 28, 6));
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void printCourseInformation() {
		for (Course course : courses) {
			System.out.println(course.toString());
			System.out.println("--------------");
		}
	}

	public void readCourseFromFile(String filePath) {
		try (Scanner fileReader = new Scanner(new File(filePath))) {
			while (fileReader.hasNextLine()) {
				Course course = readFromFile(fileReader);
				if (course != null) {
					courses.add(course);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Course readFromFile(Scanner input) {
		if (input.hasNextLine()) {
			String line = input.nextLine();
			String[] tokens = line.split(" , ");
			if (tokens[0].equals("Course")) {
				return new Course(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
						Integer.parseInt(tokens[4]));
			} else if (tokens[0].equals("RemoteCourse")) {
				return new Course(tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
						Integer.parseInt(tokens[4]));
			}
		}
		return null;
	}

	public static void main(String[] args) {
		CourseList courseList = new CourseList();
		courseList.readCourseFromFile("your_file_path_here");
		courseList.printCourseInformation();
	}
}
