
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Hesap No " + id + ": Yetersiz bakiye!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Sınıf: " + getClass().getSimpleName() + 
               " | Hesap ID: " + id + 
               " | Bakiye: " + balance + " TL" + 
               " | Faiz Oranı: %" + annualInterestRate + 
               " | Oluşturulma Tarihi: " + dateCreated;
    }
}