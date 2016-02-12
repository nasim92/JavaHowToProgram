package main.java.JavaHowToProgram.ch4;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public void printComponent(Graphics g) {
        super.printComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
}
