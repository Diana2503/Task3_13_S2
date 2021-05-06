package ru.vsu.cs.gui.controller;

import ru.vsu.cs.ArrayUtil;
import ru.vsu.cs.SimpleLinkedListQueue;
import ru.vsu.cs.common.QueueHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonResultBuildNewSecondQueueListener implements ActionListener {
    JTextField enterArray;
    JTextField secondConvertedArray;

    public ButtonResultBuildNewSecondQueueListener(JTextField enterArray, JTextField secondConvertedArray) {
        this.enterArray = enterArray;
        this.secondConvertedArray = secondConvertedArray;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] sourceArray = ArrayUtil.setArray(enterArray.getText());
        SimpleLinkedListQueue createdQueue = QueueHandler.secondConvertedQueue(ArrayUtil.arrayToSimpleLinkedListQueue(sourceArray));
        String createdLine = ArrayUtil.toString(ArrayUtil.simpleLinkedListQueueToArray(createdQueue));
        secondConvertedArray.setText(createdLine);
    }
}
