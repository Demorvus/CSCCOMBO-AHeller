import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSClasses {

	public static void main(String[] args) {

		CourseList courseList = new CourseList();

		writeCoursesToFile(courseList);

		readAndPrintCoursesFromFile();
	}

	private static void writeCoursesToFile(CourseList courseList) {
		String dbFile = "courses.txt";

		try (FileWriter fileWriter = new FileWriter(dbFile)) {
			for (Course course : courseList.getCourses()) {
				fileWriter.write(course.toString() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readAndPrintCoursesFromFile() {
		String dbFile = "courses.txt";

		try (FileReader fileReader = new FileReader(dbFile)) {
			List<Course> courses = CourseList.readCourseFromFile(fileReader);

			for (Course course : courses) {
				System.out.println(course.toString());
				System.out.println("--------------");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}