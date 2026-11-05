
import tr.istiklal.yazilim.edu.Course;

public class TestCourse {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Course course1 = new Course("Java");

        course1.addStudent("Ahmet");
        course1.addStudent("Mehmet");

        Course course2 = (Course) course1.clone();

        course2.addStudent("Ali");

        System.out.println("Course 1:");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(course1.getStudents()[i]);
        }

        System.out.println("\nCourse 2:");
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println(course2.getStudents()[i]);
        }
    }
}
