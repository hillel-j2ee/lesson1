package com.hillel.j2ee.logic;

public class VoloshchenkoVladimirLogger implements MyLogger{
    @Override
    public void print(String text){
        System.out.println("Voloshchenko  " + text );
    }
}
