package main.java.JavaHowToProgram.ch7;

/**
 * Created by nasimsalmani on 2/22/16.
 */
public class EnhancedForTest {
    public static void main(){
        int [] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        for (int i :array){
            total += i;
        }
        System.out.println(total);
    }
}
