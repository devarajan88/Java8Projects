package com.dev.java8.ConsumerAndSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        System.out.println("E.g. #2 - Java8 Supplier Example\n");

        List<String> names = new ArrayList<String>();
        names.add("Harry");
        names.add("Daniel");
        names.add("Lucifer");
        names.add("April O' Neil");

        names.stream().forEach((item) -> {
            printName(() -> item);
        });

    }

    private static void printName(Supplier<String> name) {
        System.out.println(name.get());
    }

}
