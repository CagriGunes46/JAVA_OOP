package bolum9.pkg2;


public class TestStock {

    public static void main (String[] args){
    Stock s1 = new Stock("ORCL","Oracle Corporation"); 
    s1.previousClosingPrice = 34.5;
    s1.currentPrice = 34.35;
    
    System.out.println(s1.symbol);
    System.out.println(s1.name);
    System.out.println(s1.getChangePercent());
    
    }  
    
    
}
