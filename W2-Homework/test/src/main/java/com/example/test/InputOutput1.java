package main.java.com.example.test;

import static java.lang.System.out;

public class InputOutput1 {

    public static void main(String[] args) {
        var startValue = 1;
        var endValue = 100;
        var incrementValue = 5;

        // it is always a good idea to inform what is happening

        out.println("Start of process");

        // reformatted the code so that it in in the general standard form

        for (startValue = 0; startValue <= endValue; startValue = startValue + incrementValue) {
            PrintData("The Current Value", startValue);
        }
    }

    public static void PrintData(String message, int value){

        var header = "-";
        var output = message + " = " + Integer.toString(value);
        System.out.println( header.repeat(output.length()));
        out.println(output);

    }

    /*
     * 
     * Functions and Methods are interchangable terms for the same thing. They are
     * both pieces of code that sit seperately either inside or outside the scope of
     * some other code within a project. They are executable pieces that will take
     * an input, do some work, and then optionally output some value back. They are
     * the most basic building blocks of code reusability in programming.
     * 
     * Parameters refers to the input that is needed to run a piece of code.
     * Parameters are taken on the execution of the code, and then used inside that
     * block of code. The parameters for a function would be any dynamic data or
     * values that the function would need to run every time.
     * 
     * Return statements are the final piece of execution for a function or method.
     * This statement will end the method, and optionally return value to the scope
     * that called the method to run.
     * 
     */


}
