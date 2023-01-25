package com.ebru.controlstructures;

public class IfElseStatement {
    public static void main(String[] args) {

        int day = 1;
        /*
         * if
         */
        if( day==1 ) {
            System.out.println("1. mo");
        }
        if( day==2 ) {
            System.out.println("2. tu");
        }
        /*
         * if / else
         */
        if( day >= 1 && day <= 7 ) {
            System.out.println("3. Weekday");
        } else {
            System.out.println("3. invalid value");
        }
        /*
         * if / else if
         */
        day = 6;
        if(day >= 1 && day <= 5) {
            System.out.println("4. Weekday");
        } else if(day == 6 || day == 7) {
            System.out.println("4. Weekend");
        }

        /*
         * if / else if / else
         */
        day = -2000;
        if(day==1) {
            System.out.println("5. mo");
        } else if(day==2) {
            System.out.println("5. tu");
        } else if(day==3) {
            System.out.println("5. we");
        } else if(day==4) {
            System.out.println("5. th");
        } else if(day==5) {
            System.out.println("5. fr");
        } else if(day==6 || day==7) {
            System.out.println("5. Weekend");
        } else {
            System.out.println("5. invalid value");
        }

    //===== for Exam ==== //

        /**
         * Argument for if MUST be of type boolean
         */
        int x = 1;

//		if( x ) { } // compiler error: x is int

//		if( x = 1 ) { } // compiler error: The result of the assignment is int

        /*
         * !!! The bug where the comparison operator is
         * confused with the assignment operator is still possible in Java
         * if the variable is of type boolean.
         */
        boolean b = false;

        if(b = true) { // BUG! b gets the value true when assigned
            System.out.println("Attention! Bug in the if query");
        }

        /*
         * If the curly braces are missing,
         * the next statement will be the block of the control structure.
         */
        int y = 1;
        if(y==1)
            System.out.println("1. mo");

//		if(y==1)
//			int var = 3; // compiler error. Initialization makes no sense!

        if(y==3)
            System.out.println("2. mi"); // Block of the if-clause
        System.out.println("2. do"); // does not belong to if-clause

        /*
         *  Attention! to the syntax
         */
//		if (y == 1) {
//			System.out.println("a");
//		} else if {						// compiler error with else if - condition necessary
//			System.out.println("b");
//		}

    }
}
