import java.util.Date;

public class Transaction {
    private Date date;
    private char type;         // 'W' for withdraw, 'D' for deposit
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Tarih: " + date + 
               " | Tür: " + (type == 'D' ? "Yatırma (D)" : "Çekme (W)") + 
               " | Miktar: $" + amount + 
               " | Yeni Bakiye: $" + balance + 
               " | Açıklama: " + description;
    }
}