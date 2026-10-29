
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("0 ile biten bir sayı dizisi girin: ");
        int value = input.nextInt();

        while (value != 0) {
            list.add(value);
            value = input.nextInt();
        }

        Integer maximum = max(list);

        if (maximum == null) {
            System.out.println("Liste boş veya geçersiz.");
        } else {
            System.out.println("Girdiğiniz en büyük sayı: " + maximum);
        }

        input.close();
    }

   
     
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }
}