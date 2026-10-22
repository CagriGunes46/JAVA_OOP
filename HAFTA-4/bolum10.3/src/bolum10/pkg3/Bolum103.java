
package bolum10.pkg3;
import tr.istiklal.yazili.edu.MyInteger.MyInteger;

public class Bolum103 {

    public static void main(String[] args) {
        
        MyInteger n1 = new MyInteger(7);
        MyInteger n2 = new MyInteger(24);
        MyInteger n3 = new MyInteger(7);

        System.out.println("n1 degeri: " + n1.getValue());
        System.out.println("n2 degeri: " + n2.getValue());

        // 2. Parametresiz (nesneye ait) metotların testi (isEven, isOdd, isPrime)
        System.out.println("\n--- Nesne Metotlari (n1 = 7) ---");
        System.out.println("n1 cift mi (isEven): " + n1.isEven());
        System.out.println("n1 tek mi (isOdd): " + n1.isOdd());
        System.out.println("n1 asal mi (isPrime): " + n1.isPrime());

        // 3. Static int alan metotların testi (isEven(int), isOdd(int), isPrime(int))
        System.out.println("\n--- Static int Metotlari ---");
        System.out.println("10 cift mi: " + MyInteger.isEven(10));
        System.out.println("10 tek mi: " + MyInteger.isOdd(10));
        System.out.println("10 asal mi: " + MyInteger.isPrime(10));

        // 4. Static MyInteger alan metotların testi
        System.out.println("\n--- Static MyInteger Metotlari ---");
        System.out.println("n2 cift mi: " + MyInteger.isEven(n2));
        System.out.println("n2 tek mi: " + MyInteger.isOdd(n2));
        System.out.println("n2 asal mi: " + MyInteger.isPrime(n2));

        // 5. equals metotlarının testi (equals(int) ve equals(MyInteger))
        System.out.println("\n--- Equals Metotlari ---");
        System.out.println("n1 degeri 7'ye esit mi: " + n1.equals(7));
        System.out.println("n1 degeri 9'a esit mi: " + n1.equals(9));
        System.out.println("n1, n2'ye esit mi: " + n1.equals(n2));
        System.out.println("n1, n3'e esit mi: " + n1.equals(n3));

        // 6. parseInt metotlarının testi (char[] ve String)
        System.out.println("\n--- parseInt Metotlari ---");
        char[] charDizi = {'1', '2', '3', '4'};
        int charSonuc = MyInteger.parseInt(charDizi);
        System.out.println("char[] parse sonucu: " + (charSonuc + 1)); // Sayı olduğunu kanıtlamak için 1 ekler (1235 basar)

        String metin = "5678";
        int strSonuc = MyInteger.parseInt(metin);
        System.out.println("String parse sonucu: " + (strSonuc + 1));  // Sayı olduğunu kanıtlamak için 1 ekler (5679 basar)
    }
        
        
    }
    

