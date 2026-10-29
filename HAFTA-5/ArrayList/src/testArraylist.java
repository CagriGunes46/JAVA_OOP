import java.util.ArrayList;
import java.util.Scanner;

public class testArraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("0 ile biten bir sayı dizisi giriniz (Örn: 3 5 95 4 15 0):");

        int num = input.nextInt();
        while (num != 0) {
            numbers.add(num);
            num = input.nextInt();
        }

        Integer largest = max(numbers);

        if (largest == null) {
            System.out.println("Hiçbir sayı girilmedi (liste boş).");
        } else {
            System.out.println("Girilen en büyük sayı: " + largest);
        }

        input.close();
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }
}