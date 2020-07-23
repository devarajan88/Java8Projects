package com.dev.java8.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Solution {

    public static void main(String[] args) {
        List<Edge> cities = new ArrayList<>();
        cities.add(new Edge(new Node("LA"), new Node("NY"), 50));
        cities.add(new Edge(new Node("Sydney"), new Node("Melbourne"), 30));
        cities.add(new Edge(new Node("Rome"), new Node("Venice"), 20));
        Predicate<Edge> edgePredicate = e -> e.getDist() >= 30;
        filter(edgePredicate, cities);
    }

    public static void filter(Predicate<Edge> predicate, List<Edge> items) {
        for (Edge item : items) {
            if (predicate.test(item)) {
                System.out.println(item.getOrigin().getValue().toString() + " to " + item.getDest().getValue().toString() + " : " + item.getDist());

            }
        }
    }

}
