import tr.istiklal.yazilim.edu.Rectangle;
import tr.istiklal.yazilim.edu.GeometricObject;
import tr.istiklal.yazilim.edu.Circle;
import tr.istiklal.yazilim.edu.Colorable;
import tr.istiklal.yazilim.edu.Square;
public class TestColorable {

    public static void main(String[] args) {


        GeometricObject[] objects = {
            new Circle(5),
            new Rectangle(4, 6),
            new Square(4),
            new Circle(3),
            new Rectangle(5, 8)
        };

 
        for (int i = 0; i < objects.length; i++) {

            System.out.println("Object " + (i + 1));
            System.out.println("Area: " + objects[i].getArea());


            if (objects[i] instanceof Colorable) {

                ((Colorable) objects[i]).howToColor();
            }

            System.out.println();
        }
    }
}
