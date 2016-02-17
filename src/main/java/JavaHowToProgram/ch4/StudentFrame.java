package main.java.JavaHowToProgram.ch4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentFrame extends JFrame {
    private String name;
    private double average;
    private JPanel mainPanel;
    private JButton submit;
    private JTextField nameTextField;
    private JTextField averageTextField;
    private JButton showNameButton;
    private JButton showAverageButton;

    public StudentFrame(String name, double average){
        super("StudentFrame");
        this.name = name;

        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;

        mainPanel = new JPanel(new FlowLayout());
        submit = new JButton("submit");
        nameTextField = new JTextField();
        averageTextField = new JTextField();
        showNameButton = new JButton("show name");
        showAverageButton= new JButton("show average");

        mainPanel.add(submit);
        mainPanel.add(nameTextField);
        mainPanel.add(averageTextField);
        mainPanel.add(showNameButton);
        mainPanel.add(showAverageButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        setVisible(true);
        setSize(500, 500);

        pack();

        showNameButton.addActionListener(new ShowNameButtonActionListener());
        showAverageButton.addActionListener(new ShowAverageButtonActionListener());
        submit.addActionListener(new SubmitButtonActionListener());
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setAverage(double studentAverage){
        if (average > 0.0)
            if (average <= 100.0)
                this.average = average;
    }
    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        String letterGrade = "";
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
        letterGrade = "B";

        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
        letterGrade = "F";

        return letterGrade;
    }


    public class ShowNameButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class ShowAverageButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class SubmitButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
