package com.hillel.j2ee.logic;

public class RuslanLogger implements MyLogger {

    @Override
    public void print(String text) {
        System.out.println("Ruslan: " + text);
    }
}
