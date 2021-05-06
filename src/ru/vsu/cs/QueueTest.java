package ru.vsu.cs;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.common.QueueHandler;

public class QueueTest {

    @Test
    public void convertListTest1() {
        int[] sourceArrayFirst = {1, -4, 7, 4, 2};
        int[] sourceArraySecond = {1, -4, 7, 4, 2};
        int[] testArray = {-4, 1, 4, 7, 2};
        String firstQueue = ArrayUtil.toString(ArrayUtil.queueToArray(QueueHandler.firstConvertedQueue(ArrayUtil.arrayToQueue(sourceArrayFirst))));
        String secondQueue = ArrayUtil.toString(ArrayUtil.simpleLinkedListQueueToArray(QueueHandler.secondConvertedQueue(ArrayUtil.arrayToSimpleLinkedListQueue(sourceArraySecond))));
        String thirdQueue = ArrayUtil.toString(testArray);
        Assert.assertEquals(firstQueue, secondQueue, thirdQueue);
    }

    @Test
    public void convertListTest2() {
        int[] sourceArrayFirst = {9, -3, 45, 4, -3, 67, 89, 4};
        int[] sourceArraySecond = {9, -3, 45, 4, -3, 67, 89, 4};
        int[] testArray = {-3, 9, 4, 45, 67, -3, 4, 89};
        String firstQueue = ArrayUtil.toString(ArrayUtil.queueToArray(QueueHandler.firstConvertedQueue(ArrayUtil.arrayToQueue(sourceArrayFirst))));
        String secondQueue = ArrayUtil.toString(ArrayUtil.simpleLinkedListQueueToArray(QueueHandler.secondConvertedQueue(ArrayUtil.arrayToSimpleLinkedListQueue(sourceArraySecond))));
        String thirdQueue = ArrayUtil.toString(testArray);
        Assert.assertEquals(firstQueue, secondQueue, thirdQueue);
    }

    @Test
    public void convertListTest3() {
        int[] sourceArrayFirst = {4};
        int[] sourceArraySecond = {4};
        int[] testArray = {4};
        String firstQueue = ArrayUtil.toString(ArrayUtil.queueToArray(QueueHandler.firstConvertedQueue(ArrayUtil.arrayToQueue(sourceArrayFirst))));
        String secondQueue = ArrayUtil.toString(ArrayUtil.simpleLinkedListQueueToArray(QueueHandler.secondConvertedQueue(ArrayUtil.arrayToSimpleLinkedListQueue(sourceArraySecond))));
        String thirdQueue = ArrayUtil.toString(testArray);
        Assert.assertEquals(firstQueue, secondQueue, thirdQueue);
    }
}
