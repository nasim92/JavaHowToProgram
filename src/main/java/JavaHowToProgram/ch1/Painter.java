package main.java.JavaHowToProgram.ch1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nasimsalmani on 2/5/16.
 */
public class Painter extends JFrame {

    public static void main(String args[]) {

        JFrame application = new JFrame("A simple paint program");

        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);

        application.add(new JLabel("Drag the mouse to draw"),
                BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
}