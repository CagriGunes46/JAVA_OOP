
package tr.istiklal.edu.yazilim.fan;


public class Fan {
   
    public static final int Slow = 1;
    public static final int Medıum = 2;
    public static final int Fast = 3;
    
    
    private int speed = Slow;
    private boolean on =false;
    
    private double radius =5;
    
    private String color = "blue";
    
    public int getSpeed(){
    return speed;
    }
    
    public boolean ison(){
    return on;
    }
    
    public double getRadius(){
    return radius;
    }
    
    public String getcolor(){
    return color;
    }    
    
    public void setSpeed(int yeniSpeed){
    speed=yeniSpeed;
    }
    
    public void seton(boolean yeniOn){
    on=yeniOn;
    }
    
    public void setRadius(double yeniRadius){
    radius=yeniRadius;
    }
    
    public void setcolor(String yeniColor){
    color=yeniColor;
    }    
        
    
    public Fan(){ 
    }    
    
    public String toString(){
    
    if (on) {
        return "speed: " + speed + " color: " + color + " radius: " + radius;
    } else {
        return "fan is off, color: " + color + ", radius: " + radius;
    }
    
    }
    
}
