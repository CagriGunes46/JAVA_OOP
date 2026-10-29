import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

   
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    
    public int getSize() {
        return size();
    }

    
    public Object peek() {
        return get(size() - 1);
    }

 
    public Object pop() {
        return remove(size() - 1);
    }


    public void push(Object o) {
        add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}