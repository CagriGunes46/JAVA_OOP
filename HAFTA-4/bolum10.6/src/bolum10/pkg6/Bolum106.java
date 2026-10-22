
package bolum10.pkg6;
import tr.istiklal.yazilim.edu.StackOfIntegers.StackOfIntegers;

public class Bolum106 {


    public static void main(String[] args) {
        
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                stack.push(i);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        
        
        
        
        
        
        
        
        
  
    }
    
}
