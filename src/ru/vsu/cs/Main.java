package ru.vsu.cs;

import ru.vsu.cs.common.QueueHandler;

import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String line = readLine("Enter array of digits: ");
        Queue<Integer> createdQueue = QueueHandler.firstConvertedQueue(ArrayUtil.arrayToQueue(ArrayUtil.setArray(line)));
        String createdLine = ArrayUtil.toString(ArrayUtil.queueToArray(createdQueue));
        System.out.println(createdLine);

        System.out.println("- - - - - - -");

        SimpleLinkedListQueue createdSimpleLinkedListQueue = QueueHandler.secondConvertedQueue(ArrayUtil.arrayToSimpleLinkedListQueue(ArrayUtil.setArray(line)));
        String createdSimpleLinkedLine = ArrayUtil.toString(ArrayUtil.simpleLinkedListQueueToArray(createdSimpleLinkedListQueue));
        System.out.println(createdSimpleLinkedLine);
    }

    public static String readLine(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.print(name);
        return scn.nextLine();
    }
}

