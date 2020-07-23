package com.dev.java8.ConsumerAndSupplier;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        System.out.println("E.g. #1 - Java8 Consumer Example\\n");

        Consumer<String> consumer = ConsumerTest::printNames;
        consumer.accept("C++");
        consumer.accept("Java 8");
        consumer.accept("Python");
    }

    private static void printNames(String name) {
        System.out.println(name);
    }

}
