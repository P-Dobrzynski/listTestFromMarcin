package com.company.listTest;

public class Main {
    static List<Integer> newList = new MyList<>();
    static DoublyLinkedList<Integer> newDoublyLinkedList = new MyLinkedList<>();

    public static void main(String[] args) {
        int x = 1;

        isListEmpty();
        fillTheList();
        fillTheLinkedList();

        System.out.println("data on position " + x + " is: " + newList.get(x));
        System.out.println("list size is : " + newList.size());
        newList.set(-1, 4);
        System.out.println(newList.get(4));
        System.out.println("***************** tu testujemy MyLinkedList ****************");
        isLinkedListEmpty();
        System.out.println("data on position " + x + " is: " + newDoublyLinkedList.get(x));
        System.out.println("Linkedlist size is : " + newDoublyLinkedList.size());
        newDoublyLinkedList.set(666, 1);
        System.out.println("data on position " + x + " is: " + newDoublyLinkedList.get(x));
        System.out.println(newDoublyLinkedList.getFirst());
        System.out.println(newDoublyLinkedList.getLast());
        System.out.println(newDoublyLinkedList.get(7));

    }

    public static void isListEmpty() {
        System.out.println("is list empty ? " + newList.isEmpty());
    }
    public static void isLinkedListEmpty() {
        System.out.println("is Linkedlist empty ? " + newDoublyLinkedList.isEmpty());
    }
    public static void fillTheList() {
        newList.prepend(0);
        newList.append(1);
        newList.append(2);
        newList.append(3);
        newList.append(4);
        newList.append(5);
        newList.append(6);
        newList.insert(8, 4);
        newList.insert(9, 0);
        newList.insert(10, 8);
        newList.remove(1);
    }

    public static void fillTheLinkedList() {
        newDoublyLinkedList.prepend(0);
        newDoublyLinkedList.append(1);
        newDoublyLinkedList.append(2);
        newDoublyLinkedList.append(3);
        newDoublyLinkedList.append(4);
        newDoublyLinkedList.append(5);
        newDoublyLinkedList.append(6);
        newDoublyLinkedList.insert(8, 4);
        newDoublyLinkedList.insert(9, 0);
        newDoublyLinkedList.insert(10, 9);
        newDoublyLinkedList.remove(1);
    }

}
