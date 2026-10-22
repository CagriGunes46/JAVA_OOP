
package tr.istiklal.yazilim.edu.StackOfIntegers;


public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        elements = new int[16];
        size = 0;
    }

    public void push(int value) {
        elements[size] = value;
        size++;
    }

    public int pop() {
        size--;
        return elements[size];
    }

    public boolean empty() {
        return size == 0;
    }
    
}
