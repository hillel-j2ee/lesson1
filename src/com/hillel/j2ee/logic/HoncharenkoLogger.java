package com.hillel.j2ee.logic;

public class HoncharenkoLogger implements MyLogger, Runnable {
    @Override
    public void print(String name) {
        System.out.printf("Thank you for lessons %s, please give me more practise for the next home work! %n", name);
    }

    @Override
    public void run() {
        print("Igor");
    }
}
