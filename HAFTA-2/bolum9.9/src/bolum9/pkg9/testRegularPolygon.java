package bolum9.pkg9;
import tr.istiklal.edu.yazilim.RegularPolygon.RegularPolygon;

public class testRegularPolygon {

    public static void main(String[] args) {
        
    RegularPolygon RegularPolygon1= new  RegularPolygon();    
    RegularPolygon RegularPolygon2= new  RegularPolygon(6, 4);    
    RegularPolygon RegularPolygon3= new  RegularPolygon(10, 4, 5.6, 7.8);    
        
    System.out.println("Perimeter 1: " + RegularPolygon1.getPerimeter());
    System.out.println("Area 1: " + RegularPolygon1.getArea());    
    
    System.out.println("Perimeter 2: " + RegularPolygon2.getPerimeter());
    System.out.println("Area 2: " + RegularPolygon2.getArea());        
    
    
    System.out.println("Perimeter 3: " + RegularPolygon3.getPerimeter());
    System.out.println("Area 3: " + RegularPolygon3.getArea());      
        
    }
    
}
