package ru.vsu.cs.gui.frame;

import ru.vsu.cs.gui.controller.ButtonResultBuildNewFirstQueueListener;
import ru.vsu.cs.gui.controller.ButtonResultBuildNewSecondQueueListener;

import javax.swing.*;

public class Frame extends JFrame {
    private JTextField enterArray;
    private JTextField firstConvertedArray;
    private JTextField secondConvertedArray;
    private JButton buildNewFirstArrayButton;
    private JButton buildNewSecondArrayButton;
    private JPanel mainPanel;

    public Frame() {

        setTitle("Task №3");
        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();
        setBounds(450, 250, 650, 400);

        buildNewFirstArrayButton.addActionListener(new ButtonResultBuildNewFirstQueueListener(enterArray, firstConvertedArray));
        buildNewSecondArrayButton.addActionListener(new ButtonResultBuildNewSecondQueueListener(enterArray, secondConvertedArray));
    }
}
