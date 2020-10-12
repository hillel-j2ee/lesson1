package com.hillel.j2ee.logic;

public class KomarovLogger implements MyLogger {
    @Override
    public void print(String text) {
        System.out.println("I am Komarov. It is my text:" + text);
    }
}
