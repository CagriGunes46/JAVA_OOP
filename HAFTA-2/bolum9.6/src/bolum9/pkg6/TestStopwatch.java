package bolum9.pkg6;

import tr.istiklal.edu.yazilim.stop.Stopwatch;

public class TestStopwatch {

    public static void main(String[] args) {
        
     double[] numbers = new double[100000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random() * 1000;
        }

        Stopwatch stopwatch = new Stopwatch();

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMinIndex = i;
            double currentMin = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }

        stopwatch.stop();

        System.out.println("100.000 sayının sıralanma süresi: " + stopwatch.getElapsedTime() + " milisaniye");
}
    
}
