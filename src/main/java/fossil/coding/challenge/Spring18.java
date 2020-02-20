package fossil.coding.challenge;

import dek.algorithm.linked_list.LinkedList;
import dek.algorithm.linked_list.Node;

public class Spring18 {

    private static LinkedList list = new LinkedList();

    public Spring18() {
        for(int i = 48; i <= 57; ++ i) {
            list.addToLast(i);
        }

        for(int i = 97; i <= 122; ++ i) {
            list.addToLast(i);
        }
    }

    public String moveStringXPosition(String str, int x) {
        String res = "";

        for(int i = 0; i < str.length(); ++i) {
            int currChar = str.charAt(i);
            Node newNode = list.walksXNode(currChar, x);
        }

        return res;
    }

    public static void main(String args[]) {
        //Spring18 spring18 = new Spring18();
        list.printList();;
    }
}
