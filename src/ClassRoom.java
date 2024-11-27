import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    private String className;
    private Teacher teacher;
    private Course course;
    private List<Student> Students;

    private String schedule;

    public ClassRoom(String className, Teacher teacher, String schedule,Course course) {
        this.className = className;
        this.teacher = teacher;
        this.schedule=schedule;
        this.course=course;
        this.Students = new ArrayList<>();

    }


    public void addStudent(Student student) {

        Students.add(student);

    }


    public void getDisplayalldetailsforclass() {


        System.out.println("class = " + className + " Teacher = " + teacher.getName() + " Schedule = "+schedule +"Course = "+course.getCoursename());
        System.out.println(" ");
        System.out.println("for students");
        for(Student s :Students){
            System.out.println(s.getName()+" "+s.getStudentId());
        }

    }






}

