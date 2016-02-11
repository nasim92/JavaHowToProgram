package main.java.JavaHowToProgram.ch3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AccountForm extends JFrame{
    private JPanel mainPanel;
    private JLabel note1;
    private JLabel note2;
    private String name;
    private JButton setNameButton;
    private JTextField setNameTextField;
    private JButton getNameButton;
    private JLabel getNameLabel;


    public AccountForm() {
        super("Welcome2");

        mainPanel = new JPanel(new FlowLayout());
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setLocation(400, 200);

        note1 = new JLabel("First Enter your name");
        note1.setBounds(80, 20, 50, 20);
        note2 = new JLabel("First Enter your name");
        note2.setBounds(80, 20, 50, 20);

        setNameButton = new JButton("Enter your name");
        setNameTextField = new JTextField("", 15);
        getNameButton = new JButton("take your name");
        getNameLabel = new JLabel("here is your name");

        mainPanel.add(note1);
        mainPanel.add(setNameButton);
        mainPanel.add(setNameTextField );
        mainPanel.add(note2);
        mainPanel.add(getNameButton);
        mainPanel.add(getNameLabel);

        getContentPane().add(mainPanel);
        setVisible(true);
        setSize(500, 500);

        setNameButton.addActionListener(new SetNAmeButtonActionListener());
        getNameButton.addActionListener(new GetNameButtonActionListener());

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public class SetNAmeButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setName(setNameTextField.getText());

        }
    }

    public  class GetNameButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getNameLabel.setText(getName());

        }
    }

}
