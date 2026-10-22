
package bolum10.pkg5;
import tr.istiklal.yazilim.edu.StackOfIntegers.StackOfIntegers;
import java.util.Scanner;

public class Bolum105 {

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2;

        while (number > 1) {
            if (number % factor == 0) {
                stack.push(factor);
                number = number / factor;
            } else {
                factor++;
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());

            if (!stack.empty()) {
                System.out.print(", ");
            }
        }  
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
    
}
