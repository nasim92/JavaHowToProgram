package main.java.JavaHowToProgram.ch7;

import main.java.JavaHowToProgram.ch4.StudentFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nasimsalmani on 2/20/16.
 */
public class InitArray extends JFrame {
    private JPanel mainPanel;
    private JTextField arrayIndex;
    private JButton submit;
    private JTextArea arrayElements;

    public InitArray() {
        super("InitArray");

        mainPanel = new JPanel(new FlowLayout());
        arrayIndex = new JTextField("", 8);
        submit = new JButton("submit");
        arrayElements = new JTextArea(5, 10);

        mainPanel.add(arrayIndex);
        mainPanel.add(submit);
        mainPanel.add(arrayElements);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);
        setVisible(true);
        setSize(500, 500);

        pack();

        submit.addActionListener(new SubmitFrameSubmitButtonActionListener());
    }

    public void createArray(int index) {

        int[] arr = new int[index];
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < arr.length; counter++) {
            arrayElements.setText("" + arr[counter]);
        }
    }


    public class SubmitFrameSubmitButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            createArray(Integer.parseInt("" + arrayIndex.getText()));
        }
    }


}
