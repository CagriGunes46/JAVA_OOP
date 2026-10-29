package bolum11;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Emre Ayözcan", "Kadıköy, İstanbul", "05551112233", "emre@mail.com");
        
        Student student = new Student("Enis Öngenç", "Çankaya, Ankara", "05552223344", "enis@mail.com", Student.FRESHMAN);
        
        Employee employee = new Employee("Kaan Çelik", "Bornova, İzmir", "05553334455", "kaan@mail.com", 
                                         "Oda 101", 45000.0, new MyDate(2021, 4, 15));
        
        Faculty faculty = new Faculty("Mehmet Kaya", "Melikgazi, Kayseri", "05554445566", "memo@mail.com", 
                                      "Oda 204", 75000.0, new MyDate(2015, 8, 1), 
                                      "09:00 - 12:00", "Profesör");
        
        Staff staff = new Staff("Özcan Lale", "Nilüfer, Bursa", "05555556677", "ozcan@mail.com", 
                                "Oda 012", 35000.0, new MyDate(2019, 10, 20), "Bölüm Sekreteri");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}