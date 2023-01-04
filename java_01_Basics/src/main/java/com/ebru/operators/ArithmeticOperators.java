package com.ebru.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
        * 	+
        * 	-
        * 	*
        * 	/
        * 	%
        *
        * The result of an arithmetic operation is of AT LEAST type int.
        * If the operation involves operands that are 'wide' than int,
        * the result is of 'widest' type.
        */

        byte b1 = 1;
        byte b2 = 1;

        //byte b3 = b1 + b2; // compiler error: byte <- int
        int x1 = b1 + b2; // ok: int <- int
        /*
         *  % Returns the division remainder
         */
        int x2 = 5 % 2; // 2
        System.out.println("x2: " + x2); // 1

        int x3 = 33 % 100;
        System.out.println("x3: " + x3); // 33

        int x4 = 10 % 7;
        System.out.println("x4: " + x4); // 3

        /*
         * What about dividing by 0?
         */
        //int x5 = 5 / 0; // Not CompilerError !!! BUT  (ArithmeticException)
        //int x6 = 5 % 0; // Not CompilerError !!! BUT  (ArithmeticException)

        //int x7 = 5. / 0; // compiler error: int<-double
        double d1 = 5.0 / 0; // not an exception, but special value: infinity
        System.out.println("d1: " + d1); // Infinity

        /*
         *Dividing the whole numbers: the numbers after comma are thrown away
         */
        int x8 = 5 / 2;
        System.out.println("x8: " + x8); // 2

        /*
         * another special value for double: NaN
         */
        double d2 = Math.sqrt(-4);
        System.out.println("d2: " + d2); // NaN

    }
}
