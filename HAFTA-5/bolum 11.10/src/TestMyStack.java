import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.println("Lütfen 5 adet kelime/metin (string) giriniz:");

   
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". metin: ");
            String text = input.nextLine();
            stack.push(text);
        }

        System.out.println("\nGirilen metinlerin tersten sıralanışı (LIFO):");

       
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        input.close();
    }
}