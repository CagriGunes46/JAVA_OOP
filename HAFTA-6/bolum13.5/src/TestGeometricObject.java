import tr.istiklal.yazılım.edu.Circle;
import tr.istiklal.yazılım.edu.Rectangle;
import tr.istiklal.yazılım.edu.GeometricObject;

public class TestGeometricObject {

    public static void main(String[] args) {

        // Create two circles
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);

        // Find the larger circle
        GeometricObject largerCircle =
                GeometricObject.max(circle1, circle2);

        System.out.println("Larger circle:");
        System.out.println(largerCircle);


        // Create two rectangles
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(6, 8);

        // Find the larger rectangle
        GeometricObject largerRectangle =
                GeometricObject.max(rectangle1, rectangle2);

        System.out.println("\nLarger rectangle:");
        System.out.println(largerRectangle);
    }
}
