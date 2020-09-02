package com.company.listTest;

public class Main {
    static List<Integer> newList = new MyList<>();
    static List<Integer> newLinkedList = new MyLinkedList<>();

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
        System.out.println("data on position " + x + " is: " + newLinkedList.get(x));
        System.out.println("Linkedlist size is : " + newLinkedList.size());
        newLinkedList.set(666, 1);
        System.out.println("data on position " + x + " is: " + newLinkedList.get(x));

    }

    public static void isListEmpty() {
        System.out.println("is list empty ? " + newList.isEmpty());
    }
    public static void isLinkedListEmpty() {
        System.out.println("is Linkedlist empty ? " + newLinkedList.isEmpty());
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
        newLinkedList.prepend(0);
        newLinkedList.append(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.append(4);
        newLinkedList.append(5);
        newLinkedList.append(6);
        newLinkedList.insert(8, 4);
        newLinkedList.insert(9, 0);
        newLinkedList.insert(10, 8);
        newLinkedList.remove(1);
    }
}
