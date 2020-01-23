package dek.algorithm;

import dek.algorithm.two_pointers.SlidingWindow;

public class Algorithm {

    private static Algorithm algorithm = null;
    private static AlgorithmFactory factory;
    private static SlidingWindow slidingWindow;

    private Algorithm() {
        slidingWindow = factory.createLinkedListAlgorithm();
    }

    public static Algorithm Algorithm(String type) {
        if(algorithm == null) {
            algorithm = new Algorithm();
        } else {
            slidingWindow = factory.createLinkedListAlgorithm();
        }

        return algorithm;
    }

    public SlidingWindow getSlidingWindow() {
        return slidingWindow;
    }
}
