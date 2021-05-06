package ru.vsu.cs;

import java.util.*;

        /**
         * Набор функций для работы с массивами
         *
         * @author Дмитрий Соломатин (кафедра ПиИТ ФКН ВГУ)
         */

public class ArrayUtil {
    public static int[] setArray(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        int sizeArray = list.size();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static String toString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            stringBuilder.append(arr[i]).append(" ");
        }
        return stringBuilder.toString();
    }

    public static Queue<Integer> arrayToQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int value : array) {
            queue.add(value);
        }
        return queue;
    }

    public static SimpleLinkedListQueue arrayToSimpleLinkedListQueue(int[] array) {
        SimpleLinkedListQueue queue = new SimpleLinkedListQueue();
        for (int value : array) {
            queue.add(value);
        }
        return queue;
    }

    public static int[] queueToArray(Queue<Integer> queue) {
        int[] array = new int[queue.size()];
        int index = 0;
        for (Integer value : queue) {
            array[index] = value;
            index++;
        }
        return array;
    }

    public static int[] simpleLinkedListQueueToArray(SimpleLinkedListQueue queue) {
        int[] array = new int[queue.getCount()];
        int index = 0;
        for (Integer value : queue) {
            array[index] = value;
            index++;
        }
        return array;
    }
}
