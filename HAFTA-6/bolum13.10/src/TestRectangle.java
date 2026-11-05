import tr.istiklal.yazilim.edu.GeometricObject;
import tr.istiklal.yazilim.edu.Rectangle;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(3, 8);
        Rectangle rectangle3 = new Rectangle(5, 5);

        // Test equals()
        System.out.println("rectangle1 equals rectangle2: "
                + rectangle1.equals(rectangle2));

        System.out.println("rectangle1 equals rectangle3: "
                + rectangle1.equals(rectangle3));

        // Test compareTo()
        System.out.println("rectangle1 compareTo rectangle3: "
                + rectangle1.compareTo(rectangle3));
    }
}
