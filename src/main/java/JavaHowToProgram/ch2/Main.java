package main.java.JavaHowToProgram.ch2;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[]) {

        Welcome1 w1 = new Welcome1();
        w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w1.setSize(400, 200);
        w1.setVisible(true);
    }
}