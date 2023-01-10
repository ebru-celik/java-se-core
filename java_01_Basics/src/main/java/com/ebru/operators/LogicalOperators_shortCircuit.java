package com.ebru.operators;

public class LogicalOperators_shortCircuit {

    public static void main(String[] args){
        /**
         * & - 'normal'
         * && - short circuit: if the left operand is false, then the result is false
         *
         * | - 'normal'
         * || - Short circuit: if the left operand is true, then the result is true
         */

        int x = 0;
        x++; // increment (increase by 1)

        /*
         * Test with 'normal' &
         */
        System.out.println("x = " + x); // 1

        boolean result = x > 100 & x++ < 2000; // both of the operands are calculated
        System.out.println("result = " + result); // false

        System.out.println("x = " + x); // 2  !!!

        /*
         * Test with short-circuit &&
         */
        int y = 1;
        System.out.println("y = " + y); // 1

        result = y > 100 && y++ < 2000; // only left operand ist calculated.
        System.out.println("result = " + result);

        System.out.println("y = " + y); // 1 ///
    }
}
