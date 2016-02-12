package main.java.JavaHowToProgram.ch5;

import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhileCounter extends JFrame{

    private JPanel mainPanel;
    private JTextField counterText;
    private JDialog d;
    private int counter = 1;

    public WhileCounter(){
        super("WhileCounter");

        mainPanel = new JPanel(new FlowLayout());
        counterText = new JTextField("");
        d = new JDialog();

        mainPanel.add(counterText);
        mainPanel.add(d);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        counterText.addActionListener(new CounterTextActionListener());
    }

    public class CounterTextActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

}
