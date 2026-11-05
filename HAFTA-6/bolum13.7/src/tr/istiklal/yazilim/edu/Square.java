package tr.istiklal.yazilim.edu;


public class Square extends GeometricObject
        implements Colorable {

    private double side;

    // No-arg constructor
    public Square() {
        side = 0;
    }

    // Constructor with specified side
    public Square(double side) {
        this.side = side;
    }

    // Getter
    public double getSide() {
        return side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
