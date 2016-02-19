package main.java.JavaHowToProgram.ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class SecureRandomForm extends JFrame{
    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton generateRandomButton;


    public SecureRandomForm(){
        mainPanel = new JPanel(new FlowLayout());
        textArea = new JTextArea();
        generateRandomButton = new JButton("generateRandomButton");

        mainPanel.add(textArea);
        mainPanel.add(generateRandomButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        setVisible(true);
        setSize(500, 500);

        textArea.setSize(300, 550);

        pack();
        generateRandomButton.addActionListener(new GenerateRandomButtonActionListener());
    }

    public void randomIntegers() {
        SecureRandom randomNumbers = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6);
            textArea.setText(String.valueOf(face));

            if (counter % 5 == 0)
                System.out.println();
        }
    }



    public class GenerateRandomButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            randomIntegers();
            pack();
        }
    }
}
