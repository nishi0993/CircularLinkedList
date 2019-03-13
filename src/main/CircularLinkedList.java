package main;

public class CircularLinkedList {
    int size=0;
    Node head=null;
    Node tail=null;
class Node{
int data;
Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next= next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public void print(){

}

    public static void main(String[] args) {

    }
}
