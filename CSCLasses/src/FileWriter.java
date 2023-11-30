import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
    private String dbFile = "CoursesDatabase.csv";

    PrintWriter printer;

    public FileWriter() throws FileNotFoundException {
        File courseFile = new File(dbFile);
        printer = new PrintWriter(courseFile);
    }

    public void writeToFile(Course course) {
        printer.println(course.dbString());
    }

    public void close() {
        printer.close();
    }
}