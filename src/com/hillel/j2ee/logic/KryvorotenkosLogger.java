package com.hillel.j2ee.logic;

public class KryvorotenkosLogger {
    String text;

    public KryvorotenkosLogger() {
    }

    public KryvorotenkosLogger(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Ilya Kryvorotenko's logger say: " + this.text);
    }
}
