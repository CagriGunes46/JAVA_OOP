
package bolum9.pkg13;
import java.util.Scanner;
import tr.istiklal.edu.yazilim.location.Location;
public class TestLocation {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan satır ve sütun sayısını alma
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];

        // Kullanıcıdan matris elemanlarını isteme
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        // Location sınıfındaki static metodu çağırarak en büyük elemanı bulma
        Location loc = Location.locateLargest(array);

        // Sonucu ekrana yazdırma
        System.out.println("The location of the largest element is " + loc.maxValue + 
                           " at (" + loc.row + ", " + loc.column + ")");
    }
}
    
