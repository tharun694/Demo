package org.practice.linkedlist;

public class LL {
    Node head;
    Node tail;
    int size;
    LL() {
        this.size = 0;
    }
    void insert(int value) {
        if (tail == null) {
            tail = head;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
        size += 1;
    }
    void display() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }
    void insertindex(int value, int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size += 1;
    }
    public void delete(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void deleteLast() {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size -= 1;
    }

    class Node {
        Node(int value) {
            this.value = value;

        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        int value;
        Node next;
Node prev;
    }

}

