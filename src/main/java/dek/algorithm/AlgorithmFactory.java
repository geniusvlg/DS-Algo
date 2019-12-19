package dek.algorithm;

public class AlgorithmFactory {

    public static LinkedList createLinkedListAlgorithm(String type) {
        switch(type) {
            case "middleNode":
                return new MiddleNode();
            default:
                return null;
        }
    }

}
