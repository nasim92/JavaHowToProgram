package main.java.JavaHowToProgram.ch2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stars extends JFrame {
    private JPanel mainPanel;
    private JButton clearStarsButton;
    private JTextArea printStarsArea;
    private JComboBox shapeListComboBox;

    public Stars(){
        super("Select your stars");

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        clearStarsButton = new JButton("ClearStars");
        printStarsArea = new JTextArea();
        shapeListComboBox = new JComboBox(ShapeType.values());

        mainPanel.add(shapeListComboBox);
        mainPanel.add(clearStarsButton);
        mainPanel.add(printStarsArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);


        setSize(400, 200);

        clearStarsButton.addActionListener(new clearStarsButtonActionListener());
        shapeListComboBox.addActionListener(new shapeListComboBoxActionListener());
    }

    public void printstars(ShapeType shape) {
        switch (shape) {
            case RECTANGULAR:
                for (int i = 2; i <= 5; i++) {
                    printStarsArea.append("*");
                }
                printStarsArea.append("*\f   *\f\r\n");
                for (int j = 2; j <= 3; j++) {
                    printStarsArea.append("*");
                }

            case SQUARE:
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 5; j++) {
                        printStarsArea.append("*");
                    }
                    printStarsArea.append("" + '\n');
                }

            case TRIANGLE:
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        printStarsArea.append("*");
                    }
                    printStarsArea.append("" + '\n');
                }
        }
    }

    public class shapeListComboBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clear();
            printstars((ShapeType) shapeListComboBox.getSelectedItem());
        }
    }

    public class clearStarsButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clear();
        }
    }

    private void clear() {
        printStarsArea.setText(null);
    }
}
