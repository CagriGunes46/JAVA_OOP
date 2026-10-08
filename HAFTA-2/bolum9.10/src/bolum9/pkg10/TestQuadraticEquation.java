
package bolum9.pkg10;
import tr.istiklal.edu.yazilim.QuadraticEquation.QuadraticEquation;
import java.util.Scanner;

public class TestQuadraticEquation {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        
        if (eq.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + eq.getRoot1() + " and " + eq.getRoot2());
        } else if (eq.getDiscriminant() == 0) {
            System.out.println("The equation has one root " + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }        
   
    }
    
}
