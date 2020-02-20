package dek.algorithm.linked_list;

public class LinkedList {

    Node head = null;
    Node tail = null;

    public void addToLast(int val) {
        Node temp = new Node(val);

        if(head == null) {
            head = temp;
            tail = temp;
            tail.next = head;
        } else {

            Node curr = head;

            while(curr != tail) {
                curr = curr.next;
            }

            tail.next = temp;
            tail = tail.next;
            tail.next = head;
        }
    }

    public Node findNode(int val) {
        Node temp = head;
        while(temp != tail) {
            temp = temp.next;

            if(temp.val == val)
                return temp;
        }

        return null;
    }


    public void printList() {

        try {
            Node temp = head;
            while(temp.next != head) {
                System.out.println(temp.val);
                temp = temp.next;
            }
            System.out.println(temp.val);

        } catch (NullPointerException e){
            System.out.println("NULL POINTER EXCEPTION");
            e.printStackTrace();
        }

    }

    public Node walksXNode(int val, int x) {
        Node temp = findNode(val);

        for(int i = 0; i < x; ++i) {
            temp = temp.next;
        }

        return temp;
    }
}
