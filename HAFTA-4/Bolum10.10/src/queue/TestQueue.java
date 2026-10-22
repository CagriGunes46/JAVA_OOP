
package queue;
import tr.istiklal.yazilim.edu.queue.Queue;

public class TestQueue {


    public static void main(String[] args) {
        
        
        Queue queue = new Queue();

        
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        System.out.println("Kuyruktan cikarilan elemanlar (FIFO):");

        
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }

}
    

