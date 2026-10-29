package bolum11;

public class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int status;

    public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case FRESHMAN:
                return "Freshman";
            case SOPHOMORE:
                return "Sophomore";
            case JUNIOR:
                return "Junior";
            case SENIOR:
                return "Senior";
            default:
                return "Bilinmeyen Sınıf";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sınıf: " + this.getClass().getSimpleName() + ", Kişi: " + getName();
    }
}
