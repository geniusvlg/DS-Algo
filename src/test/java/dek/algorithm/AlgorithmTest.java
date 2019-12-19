package dek.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    public void twoPointersTest() {

        Algorithm algorithm = Algorithm.Algorithm("middleNode");
        algorithm.getLinkedList().addToTop(1);
        algorithm.getLinkedList().addToTop(2);
        algorithm.getLinkedList().addToBottom(5);
        algorithm.getLinkedList().printLinkedList();
    }
}