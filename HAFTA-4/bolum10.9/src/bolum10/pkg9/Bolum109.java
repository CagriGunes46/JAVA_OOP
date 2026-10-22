
package bolum10.pkg9;
import tr.istiklal.yazilim.edu.Course.Course;

public class Bolum109 {


    public static void main(String[] args) {

        Course course = new Course();

 
        course.addStudent("Ali");
        course.addStudent("Ayse");
        course.addStudent("Mehmet");

        System.out.println("Ogrenci Sayisi: " + course.getNumberOfStudents());

   
        System.out.println("\n'Ayse' kurstan cikariliyor");
        course.dropStudent("Ayse");

        System.out.println("Guncel Ogrenci Sayisi: " + course.getNumberOfStudents());

   
        System.out.println("\nKursta Kalan Ogrenciler:");
        String[] students = course.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
