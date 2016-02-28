package main.java.JavaHowToProgram.ch7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

public class SumArray extends JFrame {

    private JPanel mainPanel;
    private JTextArea arrayElements;
    private JButton sum;
    int[] arr = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

    public SumArray() {
        super("InitArray");

        mainPanel = new JPanel();
        sum = new JButton("submit");
        arrayElements = new JTextArea(5, 10);

        mainPanel.add(sum);
        mainPanel.add(arrayElements);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);
        setVisible(true);
        setSize(500, 500);

        pack();

        sum.addActionListener(a -> {
                    arrayElements.setText(Double.toString(sum(arr)));
                }
        );
    }

    public double sum(int[] array) {

        int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];
        System.out.printf("Total of array elements: %d%n", total);
        return total;
    }
}
