
package bolum10.pkg11;
import tr.istiklal.yazilim.edu.Circle2D.Circle2D;

public class Bolum1011 {

  
    public static void main(String[] args) {
        
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println("Contains point (3, 3): "
                + c1.contains(3, 3));

        Circle2D c2 = new Circle2D(4, 5, 10.5);

        System.out.println("Contains circle: "
                + c1.contains(c2));

        System.out.println("Overlaps circle: "
                + c1.overlaps(c2));
        

    }
    
}
