package main.java.JavaHowToProgram.ch7;

public class VarargsTest {
    public static double average(double... numbers){
        double total = 0.0;
        for (double d: numbers){
            total += d;
        }
        return total / numbers.length;
    }
}
