package main.java.JavaHowToProgram.ch8;

import javax.swing.*;
import java.awt.*;

public class Time1Form extends JFrame {
    private int hour;
    private int minute;
    private int second;

    private JPanel mainPanel;
    private JTextField hourText;
    private JTextField minuteText;
    private JTextField secondText;
    private JButton submitTime;
    private JTextField showTimeText;
    private JButton showTimeButton;

    public Time1Form() {
        super("Time1Form");

        mainPanel = new JPanel(new FlowLayout());
        hourText = new JTextField("", 8);
        minuteText = new JTextField("", 8);
        secondText = new JTextField("", 8);
        submitTime = new JButton("submitTime");
        showTimeButton = new JButton("showTimeButton");
        showTimeText = new JTextField("", 8);

        mainPanel.add(hourText);
        mainPanel.add(minuteText);
        mainPanel.add(secondText);
        mainPanel.add(submitTime);
        mainPanel.add(showTimeButton);
        mainPanel.add(showTimeText);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);
        setVisible(true);
        setSize(500, 500);

        pack();

        submitTime.addActionListener(a -> {
            setTime(Integer.parseInt(hourText.getText()), Integer.parseInt(minuteText.getText()), Integer.parseInt(secondText.getText()));
        });

        showTimeButton.addActionListener(a -> {
            showTimeText.setText(this.toUniversalString());
        });

    }

    public void setTime(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

}
