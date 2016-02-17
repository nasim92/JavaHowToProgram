package main.java.JavaHowToProgram.ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class MaximumFinderForm extends JFrame{
    private JPanel mainPanel;
    private JTextField number1;
    private JTextField number2;
    private JTextField number3;
    private JButton submit;
    private JLabel maximumNumber;

    public MaximumFinderForm() {
        super("Find Maximum number");

        mainPanel = new JPanel(new FlowLayout());
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        number1 = new JTextField();
        number2 = new JTextField();
        number3 = new JTextField();
        submit = new JButton("submit");
        maximumNumber = new JLabel();

        mainPanel.add(number1);
        mainPanel.add(number2);
        mainPanel.add(number3);
        mainPanel.add(submit);
        mainPanel.add(maximumNumber);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        setVisible(true);
        setSize(500, 500);

        pack();
        submit.addActionListener(new SubmitButtonActionListener());
    }


    public static double maximum(double x, double y, double z){
        double maximumValue = x;

        if (y > maximumValue)
            maximumValue = y;

        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }

    public class SubmitButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double maxValue = maximum(Double.parseDouble(number1.getText()),Double.parseDouble(number2.getText()), Double.parseDouble(number3.getText()));
            maximumNumber.setText(Double.toString(maxValue));
            pack();
        }
    }
}
