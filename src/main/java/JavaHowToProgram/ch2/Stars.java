package main.java.JavaHowToProgram.ch2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stars extends JFrame{
    private JPanel  mainPanel;
    private JButton clearStarsButton;
    private JTextArea printStarsArea;
    private JComboBox shapeListComboBox;
    private enum shapeType {Triangle, Square, Rectangular};
    private shapeType shape;
    public Stars() throws HeadlessException {
        super("Select your stars");

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        clearStarsButton = new JButton("ClearStars");
        printStarsArea = new JTextArea();
        shapeListComboBox = new JComboBox(shapeType.values());

        mainPanel.add(shapeListComboBox);
        mainPanel.add(clearStarsButton);
        mainPanel.add(printStarsArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);

        pack();

        clearStarsButton.addActionListener(new clearStarsButtonActionListener());
        shapeListComboBox.addActionListener(new shapeListComboBoxActionListener());
    }

    public void printstars(String shape) {
        switch(shape){
            case "Rectangular":
                for (int i = 2; i <= 5; i++){
                    printStarsArea.append("*");
                }
                printStarsArea.append("*\f   *\f\r\n");
                for(int j = 2; j <= 3; j++){
                    printStarsArea.append("*");
                }

            case "Square":
                for(int i = 0; i < 10;i++){
                    for(int j = 0; j < 5;j++){
                        printStarsArea.append("*");
                    }
                    printStarsArea.append("" + '\n');
                }

            case "Triangle":
                for (int i=0; i<6; i++)
                {
                    for (int j=0; j<i; j++)
                    {
                        printStarsArea.append("*");
                    }
                    printStarsArea.append("" + '\n');
                }
        }
    }

    public class shapeListComboBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            printstars(shapeListComboBox.getSelectedItem().toString());
            pack();
        }
    }

    public class clearStarsButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            printStarsArea.setText(null);
            pack();
        }
    }
}
