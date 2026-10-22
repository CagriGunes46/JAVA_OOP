
package tr.istiklal.yazilim.edu.MyPoint;


public class MyPoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public MyPoint(){
    x=0;
    y=0;
    }
    
    public MyPoint(double x,double y){
    this.x=x;
    this.y=y;
    }
        
    public double distance(MyPoint p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }    
    
    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }      
    
    public static double distance(MyPoint p1, MyPoint p2){
    double dx = p1.getX() - p2.getX();
    double dy = p1.getY() - p2.getY();
    return Math.sqrt(dx * dx + dy * dy);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
