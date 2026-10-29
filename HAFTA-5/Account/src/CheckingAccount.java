public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super();
        this.overdraftLimit = 500.0;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("CheckingAccount (ID: " + getId() + "): Kredi/ek hesap limiti aşıldı! Maksimum çekilebilir: " + (getBalance() + overdraftLimit) + " TL");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Ek Hesap (Overdraft) Limiti: " + overdraftLimit + " TL";
    }
}