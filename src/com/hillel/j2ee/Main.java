package com.hillel.j2ee;

import com.hillel.j2ee.logic.*;

public class Main {

    public static void main(String[] args) {
        Example.printExample();

        MyLogger log = new VitaliyLogger();
        log.print("Hi");

        MyLogger SDLogger = new SerhiiDetynychLogger();
        SDLogger.print("Why not?");

        MyLogger IgorsLog = new IgorSutulovLogger();
        IgorsLog.print("Hi everyone");
    }
}
