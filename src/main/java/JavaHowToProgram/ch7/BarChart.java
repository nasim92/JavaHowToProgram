package main.java.JavaHowToProgram.ch7;

import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarChart extends JFrame {
    private JPanel mainPanel;
    private JButton getBarChart;
    private JTextArea showBarChart;

    public BarChart() {
        super("BarChart");

        mainPanel = new JPanel(new FlowLayout());
        getBarChart = new JButton("getBarChart");
        showBarChart = new JTextArea(20, 20);

        mainPanel.add(getBarChart);
        mainPanel.add(showBarChart);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);
        setVisible(true);
        setSize(500, 500);

        pack();

        getBarChart.addActionListener(a -> {
            int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
            setBarChart(array);
        });

    }

    public void setBarChart(int[] array) {
        showBarChart.setText("Grade distribution:");
        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 10)
                showBarChart.setText("100");
            else
                showBarChart.setText("" + (counter * 10) + "" + (counter * 10 + 9));
            for (int stars = 0; stars < array[counter]; stars++)
                showBarChart.setText("*");

            showBarChart.setText("\n");
        }
    }

}
