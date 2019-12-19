package dek.algorithm;

public abstract class LinkedList{

    Node head;
    public void removeNode(int value) {
        if(head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (value == temp.next.value)
                temp = temp.next;

            temp.next = temp.next.next;
        }
    }

    public void addToTop(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToBottom(int value) {

        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }

    }

    public void printLinkedList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
