package org.practice.linkedlist;

public class DLL {
    Node head;
    void insertFirst(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null) head.prev=node;
        head=node;
    }
    void insertLast(int value){
        if(head==null)return;
        Node node =new Node(value);
        Node temp=head;
        Node last=null;
        while(temp!=null) {
            last=temp;
            temp=temp.next;
        }
        last.next=node;
        node.prev=last;
        node.next=null;
    }
    void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.value+ "-> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println();
        while(last!=null){
            System.out.print(last.value+ "-> ");
            last=last.prev;
        }
    }
    class Node{
        public Node(int value) {
            this.value = value;
        }
        public Node(Node prev, Node next) {
            this.prev = prev;
            this.next = next;
        }
        int value;
        Node next;
        Node prev;
    }
}
