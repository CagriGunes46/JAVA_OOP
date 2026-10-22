package tr.istiklal.yazili.edu.MyInteger;




public class MyInteger {
    
    private int value;

    public MyInteger(int value){
    this.value=value;
    }
    
    public int getValue() {
        return value;
    }
    

    public boolean isEven(){
    if(value%2==0){
            return true;
    }else{
        return false;
    }
    }
    
    public boolean isOdd(){
    if(value%2==1){
            return true;
    }else{
        return false;
    }        
            
        
    }    
    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false; 
            }
        }

        return true; 
    }

    public static boolean isEven(int n){
    if(n%2==0){
            return true;
    }else{
        return false;
    }
    }
    
    public static boolean isOdd(int n){
    if(n%2==1){
            return true;
    }else{
        return false;
    }        
            
        
    }    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true; 
    }
    
    public static boolean isEven(MyInteger x) {
        return isEven(x.getValue());
    }

    public static boolean isOdd(MyInteger x) {
        return isOdd(x.getValue());
    }

    public static boolean isPrime(MyInteger x) {
        return isPrime(x.getValue());
    }
    
    
    
    
    public boolean equals(int anotherValue) {
        return this.value == anotherValue;
    }

    
    public boolean equals(MyInteger o) {
        return this.value == o.getValue();
    }

    
    public static int parseInt(char[] chars) {
    return Integer.parseInt(new String(chars));
}
    
    public static int parseInt(String s) {
    return Integer.parseInt(s);
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    
}
