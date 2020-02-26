package com.dev.java8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultiThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i <=1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(new Date()));
    }

}
