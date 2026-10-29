import java.util.ArrayList;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        // Farklı nesne türlerini bir arada tutmak için Object tipinde bir ArrayList oluşturulur
        ArrayList<Object> list = new ArrayList<>();

        // İstenen nesnelerin listeye eklenmesi
        list.add(new Loan(2.5, 5, 1000)); // Loan nesnesi
        list.add(new Date());              // Date nesnesi
        list.add("Java Programlama");      // String nesnesi
        list.add(new Circle(5.0));         // Circle nesnesi

        // Döngü ile listedeki elemanların toString() metodunun çağrılması
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("----------------------------------------");
        }
    }
}


class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan [Faiz Oranı: %" + annualInterestRate + 
               ", Yıl: " + numberOfYears + 
               ", Miktar: " + loanAmount + " TL]";
    }
}


class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle [Yarıçap: " + radius + ", Alan: " + getArea() + "]";
    }
}