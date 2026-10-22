
package tr.istiklal.yazilim.edu.queue;


public class Queue {
    
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

 
    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

 
    public void enqueue(int v) {
      
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }

   
    public int dequeue() {
        if (empty()) {
            throw new RuntimeException("Kuyruk bos!");
        }

        int removedElement = elements[0];

     
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
        return removedElement;
    }

   
    public boolean empty() {
        return size == 0;
    }


    public int getSize() {
        return size;
    }
        
}
