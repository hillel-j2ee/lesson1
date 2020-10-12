package com.hillel.j2ee.logic;

public class IgorSutulovLogger implements MyLogger{
    @Override
    public void print(String text) {
        System.out.println("Igor Sutulov: " + text);
    }
}
