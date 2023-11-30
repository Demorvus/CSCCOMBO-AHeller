import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

	private static String dbFile = "CourseDatabase.csv";
	private Scanner input;

	public FileReader() {
		try {
			File courseFile = new File(dbFile);
			input = new Scanner(courseFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Course readFromFile() {
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

	public List<Course> readCourseFromFile() {
		List<Course> courseList = new ArrayList<>();
		while (input.hasNextLine()) {
			Course course = readFromFile();
			if (course != null) {
				courseList.add(course);
			}
		}
		return courseList;
	}

	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		List<Course> courses = fileReader.readCourseFromFile();

		for (Course course : courses) {
			System.out.println(course.toString());
			System.out.println("--------------");
		}
	}
}
