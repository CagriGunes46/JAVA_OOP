import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Matris boyutunu al
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        // 2. Matrisi rastgele 0 ve 1'ler ile doldur ve ekrana yazdır
        System.out.println("The random array is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // 3. En çok 1 içeren satırları bul
        ArrayList<Integer> largestRowIndices = new ArrayList<>();
        int maxRowOnes = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxRowOnes) {
                maxRowOnes = count;
                largestRowIndices.clear();
                largestRowIndices.add(i);
            } else if (count == maxRowOnes && count > 0) {
                largestRowIndices.add(i);
            }
        }

        // 4. En çok 1 içeren sütunları bul
        ArrayList<Integer> largestColIndices = new ArrayList<>();
        int maxColOnes = 0;

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxColOnes) {
                maxColOnes = count;
                largestColIndices.clear();
                largestColIndices.add(j);
            } else if (count == maxColOnes && count > 0) {
                largestColIndices.add(j);
            }
        }

        // 5. Sonuçları yazdır
        System.out.print("The largest row index: ");
        printIndices(largestRowIndices);

        System.out.print("The largest column index: ");
        printIndices(largestColIndices);

        input.close();
    }

    // İndeksleri aralarına virgül koyarak yazdırmak için yardımcı metot
    private static void printIndices(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}