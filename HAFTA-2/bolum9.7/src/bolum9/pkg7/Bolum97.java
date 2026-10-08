
package bolum9.pkg7;
import tr.istiklal.edu.yazilim.acc.Account;

public class Bolum97 {


    public static void main(String[] args) {
        
       Account account = new Account(1122, 20000); 
       
       Account.setAnnualInterestRate(4.5); 
       
       account.withdraw(2500); 
        
       account.deposit(3000);
       
       System.out.println("Balance: " + account.getBalance() + " $");
       System.out.println("MonthlyInterest: " + account.getMonthlyInterest() + " $");
       System.out.println("account date crated: " + account.getDateCreated());   
    }
    
}
