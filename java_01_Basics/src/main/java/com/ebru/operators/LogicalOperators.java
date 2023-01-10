package com.ebru.operators;

public class LogicalOperators {
    public static void main (String[] args){
        /*
         * & &&
         * | ||
         *
         * ^		(exclusive OR, XOR)
         *
         * !		(NOT)
         */

        System.out.println("*** Logic of && und &: ");
        boolean b1 = true;
        boolean b2 = true;

        boolean result = b1 && b2;
        System.out.println("true && true = " + result); // true

        result = true && false;
        System.out.println("true && false = " + result); // false

        result = false && true;
        System.out.println("false && true = " + result); // false

        result = false && false;
        System.out.println("false && false = " + result); // false

        System.out.println("\n*** Logic of || und |");
        System.out.println("true || true: " + (true || true)); // true
        System.out.println("true || false: " + (true || false)); // true
        System.out.println("false || true: " + (false || true)); // true
        System.out.println("false || false: " + (false || false)); // false

        System.out.println("\n*** Logic of ^");
        System.out.println("true ^ true: " + (true ^ true)); // false
        System.out.println("true ^ false: " + (true ^ false)); // true
        System.out.println("false ^ true: " + (false ^ true)); // true
        System.out.println("false ^ false: " + (false ^ false)); // false

        System.out.println("\n***");
        boolean v1 = true;
        System.out.println("!v1 = " + !v1); // false
    }
}
