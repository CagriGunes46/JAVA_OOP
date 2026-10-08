
package tr.istiklal.edu.yazilim.stop;


public class Stopwatch {
    
private double startTime;  
private double endTime;      


public Stopwatch(){
startTime = System.currentTimeMillis();
}

public void start(){
startTime = System.currentTimeMillis();
}

public void stop(){
endTime = System.currentTimeMillis();
}


public double getStartTime(){
return startTime;  
}

public double getEndTime(){
return endTime;  
}

public double getElapsedTime(){

    return endTime - startTime; 
}





}


