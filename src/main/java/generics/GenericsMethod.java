package generics;

/**
 * We don't want the whole class to be parameterized --> java generics method
 */
public class GenericsMethod {

    // Java Generic Method
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Pankaj");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Pankaj");

        boolean isEqual = GenericsMethod.<String>isEqual(g1, g2);

        // Above statement can be written simply as
        isEqual = GenericsMethod.isEqual(g1, g2);
        // This feature, known as type interface, allows you to invoke a generic method as an ordinary method
        // without specifying a type between angle brackets

        // Compiler will infer the type that is needed
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }
}
