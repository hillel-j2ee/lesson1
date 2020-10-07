package com.hillel.j2ee.logic;

public class VitaliyLogger implements MyLogger {

    @Override
    public void print(String text) {
        System.out.println("Vitaliy: " + text);
    }
}
