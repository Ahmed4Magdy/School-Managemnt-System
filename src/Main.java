//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Teacher teacher1 = new Teacher("Mr. Smith", 40, "555-1234", 101);
        Teacher teacher2 = new Teacher("Ms. Johnson", 35, "555-5678", 102);


        Course math = new Course("MATH101", "Mathematics");
        Course science = new Course("SCI101", "Science");




        ClassRoom classMath = new ClassRoom("Grade 10 - Mathematics", teacher1, "Mon-Wed-Fri 10:00 AM",math);
        ClassRoom classScience = new ClassRoom("Grade 10 - Science", teacher2, "Tue-Thu 11:00 AM",science);



        Student student1 = new Student("Alice", 15, "555-9999", 201);
        Student student2 = new Student("Bob", 16, "555-8888", 202);

        student1.enrollcourse(math);
        student2.enrollcourse(science);


        classMath.getDisplayalldetailsforclass();
        classScience.getDisplayalldetailsforclass();


    }
}



// Main Class
//public class SchoolManagementSystem {
//    public static void main(String[] args) {
//        // Create Teachers
//        Teacher teacher1 = new Teacher("Mr. Smith", 40, "555-1234", 101);
//        Teacher teacher2 = new Teacher("Ms. Johnson", 35, "555-5678", 102);
//
//        // Create Courses
//        Course math = new Course("MATH101", "Mathematics");
//        Course science = new Course("SCI101", "Science");
//
//        // Assign Courses to Teachers
//        math.setTeacher(teacher1);
//        teacher1.assignCourse(math);
//
//        science.setTeacher(teacher2);
//        teacher2.assignCourse(science);
//
//        // Create Students
//        Student student1 = new Student("Alice", 15, "555-9999", 201);
//        Student student2 = new Student("Bob", 16, "555-8888", 202);
//
//        // Enroll Students in Courses
//        student1.enrollCourse(math);
//        student2.enrollCourse(science);
//
//        // Create Classrooms
//        ClassRoom classMath = new ClassRoom("Grade 10 - Mathematics", teacher1, "Mon-Wed-Fri 10:00 AM");
//        ClassRoom classScience = new ClassRoom("Grade 10 - Science", teacher2, "Tue-Thu 11:00 AM");
//
//        // Add Students to Classrooms
//        classMath.addStudent(student1);
//        classScience.addStudent(student2);
//
//        // Display Class Details
//        System.out.println("School Management System:");
//        System.out.println("==========================\n");
//
//        classMath.displayClassDetails();
//        System.out.println();
//        classScience.displayClassDetails();
//    }
//}
