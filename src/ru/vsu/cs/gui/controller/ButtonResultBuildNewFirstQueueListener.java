package ru.vsu.cs.gui.controller;

import ru.vsu.cs.ArrayUtil;
import ru.vsu.cs.common.QueueHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class ButtonResultBuildNewFirstQueueListener implements ActionListener {
    JTextField enterArray;
    JTextField firstConvertedArray;

    public ButtonResultBuildNewFirstQueueListener(JTextField enterArray, JTextField firstConvertedArray) {
        this.enterArray = enterArray;
        this.firstConvertedArray = firstConvertedArray;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] sourceArray = ArrayUtil.setArray(enterArray.getText());
        Queue<Integer> createdQueue = QueueHandler.firstConvertedQueue(ArrayUtil.arrayToQueue(sourceArray));
        String createdLine = ArrayUtil.toString(ArrayUtil.queueToArray(createdQueue));
        firstConvertedArray.setText(createdLine);
    }
}
