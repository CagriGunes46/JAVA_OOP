
public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("SavingsAccount (ID: " + getId() + "): Vadeli hesap bakiyesi sıfırın altına düşemez! Çekilmek istenen: " + amount + " TL, Mevcut: " + getBalance() + " TL");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}