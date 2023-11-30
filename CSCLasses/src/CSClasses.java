import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CSClasses {

    private static String dbFile = "CoursesDatabase.csv";

    public static void main(String[] args) throws FileNotFoundException {

        List<Course> courseList = new ArrayList<>();


        courseList.add(new Course("CSC1060", 24, 21, "BP-119"));
        courseList.add(new Course("CSC1061", 15, 22, "BP-120"));
        courseList.add(new Course("CSC1062", 33, 23, "BP-122"));

        FileWriter fileWriter = new FileWriter();
        for (Course course: courseList) {
            fileWriter.writeToFile(course);
        }
        fileWriter.close();


        FileReader fileReader = new FileReader(dbFile);
        List<Course> courses = fileReader.readCoursesFromFile();

        for(Course course :courses)
        {
            System.out.println(course.toString());
        }
    }


}