package main.java.JavaHowToProgram.ch2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome1 extends JFrame{

    private JPanel mainPanel;
    private JButton welcomeButton;
    private JTextPane welcomeTextPane;

    public Welcome1() throws HeadlessException {
        super("Welcome1");

        mainPanel = new JPanel(new FlowLayout());
        welcomeTextPane = new JTextPane();
        welcomeButton = new JButton("Hello");

        mainPanel.add(welcomeTextPane);
        mainPanel.add(welcomeButton);

        welcomeTextPane.setSize(200,900);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        pack();

        welcomeButton.addActionListener(new WelcomeButtonActionListener());
    }

    public class WelcomeButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            welcomeTextPane.setText("Welcome to Java Programming!");
            pack();
        }
    }

}

