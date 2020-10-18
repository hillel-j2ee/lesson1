package com.hillel.j2ee.logic;

public class KirilYanovLogger implements MyLogger{
    @Override
    public void print(String text) {
        System.out.println("This logger says \"" + text + "\" ;");
    }
}
