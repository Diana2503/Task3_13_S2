package ru.vsu.cs;

import java.util.Iterator;

public class SimpleLinkedListQueue implements Iterable<Integer> {
    private Node head = null;
    private Node tail = null;

    private int count = 0;

    public void add(int value) {
        Node newNode = new Node(value);
        if (count > 0) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        count++;
    }

    private void changeWithNextDigit(Node node) {
        int curr = node.value;
        node.value = node.next.value;
        node.next.value = curr;
    }

    public void changeThePlaceOfDigits() {
        if (count % 2 != 0) {
            for (Node node = head; node.next != null; node = node.next.next) {
                changeWithNextDigit(node);
            }
        } else {
            for (Node node = head; node != null; node = node.next.next) {
                changeWithNextDigit(node);
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        class LinkedListIterator implements Iterator<Integer> {
            Node curr;

            public LinkedListIterator(Node head) {
                curr = head;
            }

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public Integer next() {
                int result = curr.value;
                curr = curr.next;
                return result;
            }
        }
        return new LinkedListIterator(head);
    }

    public int getCount() {
        return count;
    }
}
