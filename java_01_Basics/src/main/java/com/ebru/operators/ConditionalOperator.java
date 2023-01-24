package com.ebru.operators;

public class ConditionalOperator {

    /* Conditional Operator is also called 'ternary operator'
     * because it takes three arguments.
     * exp1 ? exp2 : exp3
     *
     * exp1 should be a boolean!
     * exp2 and exp3 should be values (not void!)
     * The result has the compatible type with the type of exp2 AND exp3
     */
    public static void main(String[] args){

        int x = 12;

        double d1 = x > 0 ? 0.1 : 33.7 ;
        System.out.println("d1: " + d1); // 0.1

        int y = 13;

        int result = x > y ? 1 : x < y ? -1 : 0; // nested conditional operators
        System.out.println("result: " + result); // -1


        String s = x > y ? "x is greater" : "x is equal to or less than y";
        System.out.println(s);
    }
}
