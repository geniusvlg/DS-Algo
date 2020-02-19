package dek.algorithm;

import java.util.Collections;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LinkedList<T> {

    private class Node<E> {
        E content;
        Node<E> next;

        public Node() {
            this(/* content */ null, /* next */ null);
        }

        public Node(E content) {
            this(content, /* next */ null);
        }

        public Node(E content, Node<E> next) {
            this.content = content;
            this.next = next;
        }

        @Override
        public String toString() {
            return this.content.toString();
        }
    }

    private class NodePair<E> {
        Node<E> previous;
        Node<E> current;

        public NodePair(Node<E> previous, Node<E> current) {
            this.previous = previous;
            this.current = current;
        }
    }

    private int size = 0;
    private Node<T> head = new Node<>(null, null);
    private Node<T> tail = head;


    public LinkedList() {
        insert(Collections.emptyList());
    }

    public LinkedList(Iterable<T> items) {
        insert(items);
    }

    public void insert(Iterable<T> items) {
        for (T item : items) {
            insert(item);
        }
    }

    public void insert(T item) {
        this.size++;

        Node<T> node = new Node<>(item, /* next */ this.tail.next);
        this.tail.next = null;
        this.tail = node;
    }

    public boolean containsAll(Iterable<T> items) {
        for (T item : items) {
            if (contains(item))
                continue;
        }
        return false;
    }

    public boolean contains(T item) {
        NodePair<T> match = walkNodesUntil((previous, node) -> {
            return item.equals(node.content);
        });
        return match.current != null;
    }

    public void removeIf(Predicate<T> predicate) {
        walkNodes((previous, current) -> {
            if (predicate.test(current.content)) {
                removeNode(previous, current);
            }
        });
    }

    public void removeLast() {
        NodePair<T> match = walkNodesUntil((previous, current) -> {
            return current == this.tail;
        });
        removeNode(match.previous, match.current);
    }

    private void walkNodes(BiConsumer<Node<T>, Node<T>> visit) {
        walkNodesUntil((previous, current) -> {
            visit.accept(previous, current);
            return false;
        });
    }

    private NodePair<T> walkNodesUntil(BiFunction<Node<T>, Node<T>, Boolean> predicate) {
        Node<T> previous = this.head;
        Node<T> current = this.head.next;

        while (current != null) {
            boolean stop = predicate.apply(previous, current);
            if (stop)
                break;
            current = current.next;
            previous = current;
        }
        return new NodePair<T>(previous, current);
    }

    private void removeNode(Node<T> previous, Node<T> current) {
        if (previous.next == this.tail) {
            this.tail = previous;
        }
        previous.next = current.next;
    }

    public int size() {
        return this.size;
    }
}
