
package tr.istiklal.edu.yazilim.acc;
import java.util.Date;

public class Account {
    
    private int id =0;
    private double balance=0;
    
    private static double annualInterestRate = 0;
    
    private Date dateCreated;
    
public Account(){
        dateCreated = new Date();
    }
    
public Account(int yeniId,double yeniBalance){
        id = yeniId;
        balance = yeniBalance;
        dateCreated = new Date();
    }  


public int getİd(){
return id;
}

public double getBalance(){
return balance;
}

public static double getAnnualInterestRate(){
return annualInterestRate;
}

public void setİd(int yeniId){
id = yeniId;
}

public void setBalance(double yeniBalance){
balance = yeniBalance;
}

public static void setAnnualInterestRate(double yeniRate){
annualInterestRate = yeniRate;
}

public Date getDateCreated(){
    return dateCreated;
}

public double getMonthlyInterestRate(){
return (annualInterestRate/100)/12;
}

public double getMonthlyInterest(){
return balance * getMonthlyInterestRate();
}

public void withdraw(double miktar){
balance = balance - miktar;
}

public void deposit(double miktar1){
    balance = balance + miktar1;

} 













}
