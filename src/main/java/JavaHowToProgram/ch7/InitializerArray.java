package main.java.JavaHowToProgram.ch7;

import com.sun.org.apache.xpath.internal.operations.Variable;

public class InitializerArray {
    public static void main(String [] args){

        final int ARRAY_LENGTH = 10;
        int [] array = new int [ARRAY_LENGTH];

        for (int i = 0; i < array.length; i++)
            array[i] = 2 + 2 * i;
            System.out.printf("%s%8s%n", "Index", "Value");
        for (int j = 0; j < array.length; j++)
            System.out.printf("%5d%8d%n", j, array[j]);
    }
}
