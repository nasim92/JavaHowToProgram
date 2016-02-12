package main.java.JavaHowToProgram.ch4;

import javax.swing.*;

public class DrawPanelTest {
    public static void main(String[] args){
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
