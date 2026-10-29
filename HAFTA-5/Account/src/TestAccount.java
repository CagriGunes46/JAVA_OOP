public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);

        SavingsAccount savingsAccount = new SavingsAccount(1001, 5000.0);
        savingsAccount.setAnnualInterestRate(3.0);

        CheckingAccount checkingAccount = new CheckingAccount(1002, 3000.0, 1500.0);
        checkingAccount.setAnnualInterestRate(1.5);

    
        account.withdraw(2500.0);
        account.deposit(3000.0);

        savingsAccount.withdraw(6000.0); 
        savingsAccount.withdraw(2000.0); 

        checkingAccount.withdraw(4000.0); 
        checkingAccount.withdraw(1000.0); 

       
        System.out.println("\n--- HESAP BİLGİLERİ ---");
        System.out.println(account.toString());
        System.out.println(savingsAccount.toString());
        System.out.println(checkingAccount.toString());
    }
}