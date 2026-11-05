package tr.istiklal.yazılım.edu;


import java.util.Date;

public abstract class GeometricObject
        implements Comparable<GeometricObject> {

    private String color = "white";
    private boolean filled;
    private Date dateCreated = new Date();

    protected GeometricObject() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {

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

    public static GeometricObject max(
            GeometricObject o1, GeometricObject o2) {

        if (o1.compareTo(o2) > 0) {
            return o1;
        }
        else {
            return o2;
        }
    }
}

