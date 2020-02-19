package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsWildcards {

    public static void main(String args[]) {

        List<Integer> ints = new ArrayList<>();
        List<Double> doub = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        doub.add(2.3);
        doub.add(3.5);
        doub.add(7.8);
        printArray(ints);
        printArray(doub);
        double sum = sum(ints);
        System.out.println("Sum of ints=" + sum);

    }

    /**
     * Just like writing our code in terms of interface, in the below method we can use all methods of upper
     * bound class Number.
     */
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for(Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void printArray(List<?> list) {
        for(Object obj: list) {
            System.out.print(obj + "::");
        }

        System.out.println();
    }
}
