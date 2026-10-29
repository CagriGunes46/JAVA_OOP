public class TestAccountTransactions {
    public static void main(String[] args) {

        Account account = new Account("George", 1122, 1000.0);
        account.setAnnualInterestRate(1.5);


        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

       
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("========== HESAP ÖZETİ ==========");
        System.out.println("Müşteri Adı       : " + account.getName());
        System.out.println("Hesap ID          : " + account.getId());
        System.out.println("Yıllık Faiz Oranı : %" + account.getAnnualInterestRate());
        System.out.println("Güncel Bakiye     : $" + account.getBalance());
        System.out.println("\n--- İŞLEM GEÇMİŞİ ---");

        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction);
        }
    }
}