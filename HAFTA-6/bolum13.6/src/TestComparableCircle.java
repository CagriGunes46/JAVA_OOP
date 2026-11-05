import tr.istiklal.yazilim.edu.Circle;
import tr.istiklal.yazilim.edu.ComparableCircle;
import tr.istiklal.yazilim.edu.GeometricObject;
import tr.istiklal.yazilim.edu.Rectangle;

public class TestComparableCircle {

    public static void main(String[] args) {

        // Create two ComparableCircle objects
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(7);

        // Compare two circles
        int result = circle1.compareTo(circle2);

        if (result > 0) {
            System.out.println("Larger circle: " + circle1.getArea());
        }
        else if (result < 0) {
            System.out.println("Larger circle: " + circle2.getArea());
        }
        else {
            System.out.println("Both circles have equal areas.");
        }


        // Create a circle and a rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(6, 8);

        // Compare circle and rectangle using max method
        GeometricObject larger =
                GeometricObject.max(circle, rectangle);

        System.out.println("\nLarger between circle and rectangle:");
        System.out.println("Area: " + larger.getArea());
    }
}
