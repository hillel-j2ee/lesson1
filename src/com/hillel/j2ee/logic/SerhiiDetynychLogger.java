package com.hillel.j2ee.logic;

public class SerhiiDetynychLogger implements MyLogger{

    @Override
    public void print(String text) {
        System.out.println("Thanks to Vitaly for the interface!");
        System.out.println(text);
    }
}
