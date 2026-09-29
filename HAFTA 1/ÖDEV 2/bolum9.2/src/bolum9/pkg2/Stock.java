package bolum9.pkg2;

public class Stock {
 String symbol;
 String name;
 double previousClosingPrice;
 double currentPrice;   
 
 
 Stock(){
}
 Stock(String newSymbol,String newName){
     symbol =newSymbol;
     name = newName;
 }
  double getChangePercent(){   
      return(((currentPrice-previousClosingPrice)/previousClosingPrice)*100); 
}
}  
 
 
 

