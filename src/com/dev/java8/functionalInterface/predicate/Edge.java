package com.dev.java8.functionalInterface.predicate;

public class Edge {

    private Node origin, dest;
    private Integer dist;

    public Edge(Node origin, Node dest) {
        this(origin, dest, 1);
    }

    public Edge(Node origin, Node dest, Integer dist) {
        this.origin = origin;
        this.dest = dest;
        this.dist = dist;
    }

    public Node getOrigin() {
        return origin;
    }

    public Node getDest() {
        return dest;
    }

    public Integer getDist() {
        return dist;
    }

    public String toString() {
        return origin + " -" + dist + "-> " + dest;
    }


}
