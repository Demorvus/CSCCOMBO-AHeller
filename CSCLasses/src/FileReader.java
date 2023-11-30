import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private Scanner input;

    public FileReader(String dbFile) throws FileNotFoundException {
        File courseFile = new File (dbFile);
        input = new Scanner(courseFile);
    }

    public Course readFromFile()
    {
        if(input.hasNextLine()) {
            String line = input.nextLine();
            String[] tokens = line.split(",");
            if(tokens[0].equals("Course")) {
                Course course = new Course (tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]),
                        tokens[4]);
                return course;
            }
            if(tokens[0].equals("RemoteCourse")) {
                Course course = new Course (tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]),
                        tokens[4]);
                return course;
            }
        }
        else {
            return null;
        }
        return null;
    }

    public List<Course> readCoursesFromFile(){
        List<Course> courseList = new ArrayList<>();
        while(input.hasNextLine()) {
            courseList.add(readFromFile());
        }
        return courseList;
    }


}
