public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("OOP");

        
        course.addStudent("Kaan Çelik");
        course.addStudent("Emre Ayözcan");
        course.addStudent("Mehmet Kaya");

        System.out.println("Ders Adı: " + course.getCourseName());
        System.out.println("Öğrenci Sayısı: " + course.getNumberOfStudents());

        System.out.print("Mevcut Öğrenciler: ");
        String[] studentList = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(studentList[i] + (i < course.getNumberOfStudents() - 1 ? ", " : ""));
        }
        System.out.println();

        // Öğrenci silme
        course.dropStudent("Kaan Çelik");

        System.out.println("\nKaan Çelik dersten çıkarıldıktan sonra:");
        System.out.println("Yeni Öğrenci Sayısı: " + course.getNumberOfStudents());
        System.out.print("Kalan Öğrenciler: ");
        studentList = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(studentList[i] + (i < course.getNumberOfStudents() - 1 ? ", " : ""));
        }
        System.out.println();
    }
}