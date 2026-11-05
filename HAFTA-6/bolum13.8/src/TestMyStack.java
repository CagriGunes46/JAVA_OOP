import tr.istiklal.yazilim.edu.MyStack;
public class TestMyStack {
    public static void main(String[] args) {

        MyStack stack1 = new MyStack();

        stack1.push("A");
        stack1.push("B");
        stack1.push("C");

        MyStack stack2 = new MyStack(stack1);

        stack1.push("D");

        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
    }
}