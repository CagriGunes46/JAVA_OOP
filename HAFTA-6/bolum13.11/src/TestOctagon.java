import tr.istiklal.yazilim.edu.GeometricObject;
import tr.istiklal.yazilim.edu.Octagon;

public class TestOctagon {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        // Create an Octagon object
        Octagon octagon1 = new Octagon(5);

        // Display area and perimeter
        System.out.println("Area: " + octagon1.getArea());
        System.out.println("Perimeter: " + octagon1.getPerimeter());

        // Clone the object
        Octagon octagon2 = (Octagon) octagon1.clone();

        // Compare two objects
        System.out.println("Compare octagon1 and octagon2: "
                + octagon1.compareTo(octagon2));
    }
}

