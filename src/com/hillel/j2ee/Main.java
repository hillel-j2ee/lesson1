package com.hillel.j2ee;

import com.hillel.j2ee.logic.Example;
import com.hillel.j2ee.logic.MyLogger;
import com.hillel.j2ee.logic.SerhiiDetynychLogger;
import com.hillel.j2ee.logic.VitaliyLogger;

public class Main {

    public static void main(String[] args) {
        Example.printExample();

        MyLogger log =  new VitaliyLogger();
        log.print("Hi");

        MyLogger SDLogger = new SerhiiDetynychLogger();
        SDLogger.print("Why not?");
    }
}
