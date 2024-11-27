import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {


    private int teacherId;
    private List<Course> assignedcourses;

    public Teacher(String name, int age, String contact, int teacherId) {

        super(name, age, contact);
        this.teacherId = teacherId;
        this.assignedcourses = new ArrayList<>();
    }


    public void assignCourse(Course course) {

        assignedcourses.add(course);

    }

    public List<Course> getAssignedcourses() {
        return assignedcourses;
    }

    public int getTeacherId() {
        return teacherId;
    }
}
