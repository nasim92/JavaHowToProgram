package main.java.JavaHowToProgram.ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nasimsalmani on 2/19/16.
 */
public class MethodOverLoadForm extends JFrame {
    private JPanel mainPanel;
    private JTextField valueTextField;
    private JButton submit;
    private JLabel squareValue;

    public MethodOverLoadForm(){
        mainPanel = new JPanel(new FlowLayout());
        valueTextField = new JTextField("", 15);
        submit = new JButton("submit");
        squareValue = new JLabel("squareValue");

        mainPanel.add(valueTextField);
        mainPanel.add(submit);
        mainPanel.add(squareValue);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        setVisible(true);
        setSize(500, 500);

        pack();

        submit.addActionListener(new SubmitButtonActionListener());
    }

    public static void m() {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));

    }

    public static int square(int intValue) {
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.printf("%nCalled square with double argument: %d%n", doubleValue);
        return doubleValue * doubleValue;
    }
//matches("(\\.)")
    public class SubmitButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (valueTextField.getText().matches("\\.")){
                double d = Double.parseDouble(valueTextField.getText());
                squareValue.setText(Double.toString(square(d)));
            }
            else {
                int i = Integer.parseInt(valueTextField.getText());
                squareValue.setText(Integer.toString(square(i)));

            }
        }
    }
}