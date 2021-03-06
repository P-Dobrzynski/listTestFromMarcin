package com.company.listTest;

public class MyList<T> implements List<T> {
    private Node<T> head = null;
    private int counter = 0;

    private static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
//        if (head == null) {
//            return true;
//        }
//        else {
//            return false;
//        }
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void prepend(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        counter++;
    }

    @Override
    public void append(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        counter++;
    }

    @Override
    public boolean insert(T data, int position) {
        if (!isValidPosition(position)) {
            return false;
        }
        if (position == 0) {
            prepend(data);
        } else {
            Node<T> previousNode = getNodeAtPosition(position-1);
            Node<T> newNode = new Node<>(data);
            newNode.next = previousNode.next;
            previousNode.next = newNode;
            counter++;
        }
        return true;
    }

    @Override
    public void remove(int position) {
        if (isValidPosition(position)) {
            if (position == 0) {
                head = head.next;
            } else {
                Node<T> previousNode = getNodeAtPosition(position-1);
                previousNode.next = previousNode.next.next;
            }
            counter--;
        }
    }

    @Override
    public T get(int position) {
        if (isValidPosition(position)) {
            Node<T> current = getNodeAtPosition(position);
            return current.data;
        }
        return null;
    }

    @Override
    public void set(T data, int position) {
        if (isValidPosition(position)) {
            Node<T> current = getNodeAtPosition(position);
            current.data = data;
        }
    }


    private boolean isValidPosition(int position) {
        if (position >= 0 && position < size()) {
            return true;
        }
        return false;
    }

    private Node<T> getNodeAtPosition(int position) {
        int temp = 0;
        Node<T> current = head;
        while (temp != position) {
            temp++;
            current = current.next;
        }
        return current;
    }
}