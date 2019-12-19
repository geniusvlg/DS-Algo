package dek.algorithm;

public class Algorithm {

    private static Algorithm algorithm = null;
    private static AlgorithmFactory factory;
    private static LinkedList linkedList;

    private Algorithm(String type) {
        linkedList = factory.createLinkedListAlgorithm(type);
    }

    public static Algorithm Algorithm(String type) {
        if(algorithm == null) {
            algorithm = new Algorithm(type);
        } else {
            linkedList = factory.createLinkedListAlgorithm(type);
        }

        return algorithm;
    }

    public void addToTop(int value) {
        linkedList.addToTop(value);
    }

    public LinkedList getLinkedList() {
        return this.linkedList;
    }
}
