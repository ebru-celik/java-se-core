package com.ebru.controlstructures;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        /*
         * Types that switch can parse:
         *
         * - byte und Byte
         * - short und Short
         * - int und Integer
         *
         * - char und Character
         *
         * - String
         *
         * - enum
         */

        int var = 1;
        /*
         * break after each branch unless you want to activate the same code for multiple case branches.
         */
        var = 1;
        switch(var) {
            case 1:
                System.out.println("1. mo");
        }

        var = 1;
        switch(var) {
            case 2:
                System.out.println("2. tu");
        }

        var = 1;
        switch(var) {
            case 2:
                System.out.println("3. tu");
            default:
                System.out.println("3. default");
        }

        System.out.println("---------------");

        var = 1;
        switch(var) {
            default: // just for testing. recommended is that default should be as the last branch.
                System.out.println("4. default");
            case 2:
                System.out.println("4. tu");
        }

        var = 1;
        switch(var) {
            default:
                System.out.println("5. default");
                break;
            case 2:
                System.out.println("5. tu");
        }

        System.out.println("-----------------");

        var = 1;
        switch (var) {
            case 1:
            case 2:
                System.out.println("6. var is either 1 or 2");
            case 3:
            case 4:
                System.out.println("6. var is either 1, 2, 3 or 4");
                break;

            default:
                System.out.println("6. var is something else");
                break;
        }

        System.out.println("-----------------");

        var = 1;
        switch (var) {
            case 1:
            case 2:
                System.out.println("7.  var is either 1 or 2");
                break;
            case 3:
            case 4:
                System.out.println("7.  var is either 3 or 4");
                break;

            default:
                System.out.println("7. var is something else");
                break;
        }

    //// ==== Exam ==== ////
        /*
         * Only constants belong in the case branches!
         * Values in case branches cannot be repeated
         */
        var = 3;
        int x = 2;
        final int k = 3;

        switch(var) {
            case 1: // Constant!
//			case x: // compiler error: x ist not Constant
            case k: // Constant!
//			case 3: // compiler error (no duplicate! case 3 already exists)
        }

        /*
         * Only the "compiler-time constants" are allowed for case branches.
         */
        final int k1 = 3;   // compiler-time Constant ( Compiler knows type and value)

        final int k2;		// runtime Constant (Compiler knows only type)
        k2 = 4;

        final int k3 = new Random().nextInt(5); // runtime Constant

        switch(var) {
            case k1:
//			case k2: // compiler error
//			case k3: // compiler error
        }
    }

}
