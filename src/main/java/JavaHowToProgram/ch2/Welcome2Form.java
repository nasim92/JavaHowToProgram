package main.java.JavaHowToProgram.ch2;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome2Form extends JFrame {

    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;

    public JTextArea input;

    public Welcome2Form() throws HeadlessException {
        super("Welcome2");

        mainPanel = new JPanel(new FlowLayout());
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        input = new JTextArea();
        input.setSize(500, 500);

        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(input);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        pack();

        button1.addActionListener(new WelcomeButton1ActionListener());
        button2.addActionListener(new WelcomeButton2ActionListener());

    }

    public class WelcomeButton1ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            input.setText("Welcome to");
            pack();
        }
    }

    public class WelcomeButton2ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            input.setText("Java Programing!");
            pack();
        }
    }

}
