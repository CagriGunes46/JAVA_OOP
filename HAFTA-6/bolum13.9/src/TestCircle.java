import tr.istiklal.yazili.edu.Circle;
import tr.istiklal.yazili.edu.GeometricObject;

public class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        // Test equals()
        System.out.println("circle1 equals circle2: "
                + circle1.equals(circle2));

        System.out.println("circle1 equals circle3: "
                + circle1.equals(circle3));

        // Test compareTo()
        System.out.println("circle1 compareTo circle3: "
                + circle1.compareTo(circle3));
    }
}
