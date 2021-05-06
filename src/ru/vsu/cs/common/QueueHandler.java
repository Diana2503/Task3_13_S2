package ru.vsu.cs.common;

import ru.vsu.cs.SimpleLinkedListQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueHandler {
    public static Queue<Integer> firstConvertedQueue(Queue<Integer> queue) {
        int size = queue.size();
        Queue<Integer> convertedQueue = new LinkedList<Integer>();
        Integer firstValue = null;
        int secondValue;
        for (int index = 0; index < size; index++) {
            if (index % 2 == 0) {
                firstValue = queue.remove();
                if ((size % 2 != 0) && (index == size - 1)) {
                    convertedQueue.add(firstValue);
                }
            } else {
                secondValue = queue.remove();
                convertedQueue.add(secondValue);
                convertedQueue.add(firstValue);
            }
        }
        return convertedQueue;
    }

    public static SimpleLinkedListQueue secondConvertedQueue(SimpleLinkedListQueue queue) {
        queue.changeThePlaceOfDigits();
        return queue;
    }
}
