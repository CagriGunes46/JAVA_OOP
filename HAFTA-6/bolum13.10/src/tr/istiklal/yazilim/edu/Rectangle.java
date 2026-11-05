package tr.istiklal.yazilim.edu;


public class Rectangle extends GeometricObject
        implements Comparable<Rectangle> {

    private double width;
    private double height;

    // No-arg constructor
    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter and setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter and setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate area
    @Override
    public double getArea() {
        return width * height;
    }

    // Calculate perimeter
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Compare rectangles based on area
    @Override
    public int compareTo(Rectangle o) {
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

    // Check whether two rectangles are equal
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            return getArea() == ((Rectangle) o).getArea();
        }
        return false;
    }
}
