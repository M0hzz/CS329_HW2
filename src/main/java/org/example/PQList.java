package org.example;

class Node {
    public string name;
    public int data;
    public Node next;

    public Node(string name, int data) {
        this.name = name;
        this.data = data;
        this.next = null;
    }
}
public class PQList {
    private Node head;
    private Node tail;

    public PQList() {
        head = null;
        tail = null;
    }

    public PQList(PQList x){
        this.head = null;
        this.size = 0;

    }

    public void add(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

    }

}
