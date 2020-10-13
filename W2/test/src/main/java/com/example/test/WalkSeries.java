package com.example.test;

import static java.lang.System.out;

public class WalkSeries {

    public static void main(String... args) {

        var startValue = 0;
        var endValue = 10;
        var incrementSize = 2;

        out.println("START:");

        for(int i=startValue; i <= endValue; i += incrementSize){
            out.println("decimal = " + i);
            out.println("binary = " + Integer.toBinaryString(i));
        }

        out.println("END");
    }
}
