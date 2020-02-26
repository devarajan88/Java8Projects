package com.dev.java8;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {

    AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }
}
