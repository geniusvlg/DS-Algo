package dek.algorithm;

public abstract class LinkedList{

    Node head;
    public void removeNode(int value) {

    }

    public void addToTop(int value) {
        Node newNode = new Node(value);
        if(head == null)
            head = newNode;

        newNode.next = head;
        head = newNode;
    }

    public void addToBottom(int value) {
        Node newNode = new Node(value);
        Node temp = head;
        while(temp != null)
            temp = temp.next;
    }



}
