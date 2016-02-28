package main.java.JavaHowToProgram.utill;


import javax.swing.*;
import java.awt.*;

public class ViewComponent extends JFrame {
    private JPanel mainPanel;
    private JTextField jTextField;
    private JButton jButton;


    public ViewComponent() {
        super("ViewComponent");

        mainPanel = new JPanel(new FlowLayout());
        jTextField = new JTextField("", 8);
        jButton = new JButton("jButton");

        mainPanel.add(jTextField);
        mainPanel.add(jButton);



    }
}
