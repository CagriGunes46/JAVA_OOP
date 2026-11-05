package tr.istiklal.yazili.edu;


public class Circle extends GeometricObject
        implements Comparable<Circle> {

    private double radius;

    // No-arg constructor
    public Circle() {
        radius = 1.0;
    }

    // Constructor with specified radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Compare two circles based on area
    @Override
    public int compareTo(Circle o) {
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

    // Check whether two circles are equal
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            return radius == ((Circle) o).radius;
        }
        return false;
    }
}
