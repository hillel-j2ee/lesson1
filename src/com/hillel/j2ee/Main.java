package com.hillel.j2ee;

import com.hillel.j2ee.logic.*;

public class Main {

    public static void main(String[] args) {
        Example.printExample();

        MyLogger log = new VitaliyLogger();
        log.print("Hi");

        MVExample.printMVExample();

        MyLogger SDLogger = new SerhiiDetynychLogger();
        SDLogger.print("Why not?");

        MyLogger IgorsLog = new IgorSutulovLogger();
        IgorsLog.print("Hi everyone");

        MyLogger komarovLogger = new KomarovLogger();
        komarovLogger.print("I am keen on writing code!");

        MyLogger Rlogger  = new RuslanLogger();
        Rlogger.print("Hi, friends!");

        KryvorotenkosLogger kryvorotenkosLogger = new KryvorotenkosLogger("That is Ilya Kryvorotenko's logger.");
        kryvorotenkosLogger.print();

        MyLogger volvladi  = new VoloshchenkoVladimirLogger();
        volvladi.print("My task number one");

        GitTest.print();
    }
}
