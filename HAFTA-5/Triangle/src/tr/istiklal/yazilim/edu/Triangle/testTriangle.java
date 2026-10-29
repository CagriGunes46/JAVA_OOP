package tr.istiklal.yazilim.edu.Triangle;
import java.util.Scanner;
public class testTriangle {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Üçgenin 3 kenarını girin (aralarında boşluk bırakarak): ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

    
        System.out.print("Üçgenin rengini girin: ");
        String color = input.next();

    
        System.out.print("Üçgen dolu mu? (true / false): ");
        boolean filled = input.nextBoolean();


        Triangle triangle = new Triangle(side1, side2, side3);


        triangle.setColor(color);
        triangle.setFilled(filled);

       
        System.out.println("\n--- uçgen ozellikleri ---");
        System.out.println("Alan: " + triangle.getArea());
        System.out.println("Çevre: " + triangle.getPerimeter());
        System.out.println("Renk: " + triangle.getColor());
        System.out.println("Dolu mu?: " + triangle.isFilled());

        input.close();
    }

}
