public class Course {

    private String coursecode;
    private String coursename;
//    private Teacher teacher;

    public Course(String coursecode, String coursename) {

        this.coursecode = coursecode;
        this.coursename = coursename;
//        this.teacher = teacher;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public String getCoursename() {
        return coursename;
    }


//    public Teacher getTeacher() {
//        return teacher;
//    }
}
