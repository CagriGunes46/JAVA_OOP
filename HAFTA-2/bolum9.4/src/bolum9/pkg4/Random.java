package bolum9.pkg4;

public class Random {


    public static void main(String[] args) {
        Random rnd = new Random(1000);
        
        for (int i = 0; i < 50; i++) {
            int sayi = rnd.nextInt(100);
            System.out.println(sayi);
        }
    }

    private Random(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int nextInt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
