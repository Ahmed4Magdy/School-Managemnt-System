import java.util.ArrayList;
import java.util.List;

public class Student extends Person {


    private int StudentId;
    private List<Course> enrolledcourses;


    public Student(String name, int age, String contact, int studentId) {

        super(name, age, contact);
        this.StudentId = studentId;
        this.enrolledcourses = new ArrayList<>();

    }


    public void enrollcourse(Course course) {
        enrolledcourses.add(course);

    }

    public int getStudentId() {
        return StudentId;
    }

    public List<Course> getEnrolledcourses() {
        return enrolledcourses;
    }
}
