package tr.istiklal.yazilim.edu;


public class Octagon extends GeometricObject
        implements Comparable<Octagon>, Cloneable {

    private double side;

    // No-arg constructor
    public Octagon() {
        side = 0;
    }

    // Constructor with specified side
    public Octagon(double side) {
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

    // Calculate area
    @Override
    public double getArea() {
        return (2 + 4.0 / Math.sqrt(2)) * side * side;
    }

    // Calculate perimeter
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    // Compare two octagons
    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) {
            return 1;
        }
        else if (getArea() < o.getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    // Clone the object
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
