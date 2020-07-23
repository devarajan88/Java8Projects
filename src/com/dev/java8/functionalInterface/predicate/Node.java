package com.dev.java8.functionalInterface.predicate;

public class Node<T extends Comparable> implements Comparable {

    private T value;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        Node<T> other = (Node<T>) o;
        return this.getValue().compareTo(other.getValue());
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Node other = (Node) obj;
        return other.getValue().equals(this.getValue());
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
