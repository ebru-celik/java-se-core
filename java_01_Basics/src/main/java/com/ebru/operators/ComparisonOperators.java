package com.ebru.operators;

public class ComparisonOperators {

    public static void main (String[] args){

        /**
         * The following operators can only compare numbers:
         *        < <= > >=
         * The following operators can also compare boolean:
         *        == !=
         */

        int x1 = 77;
        double d1 = 77;

        boolean result = x1 < d1;
        System.out.println("x1 < d1: " + result); // false

        result = x1 >= d1;
        System.out.println("x1 >= d1: " + result); // true

        char ch1 = 'a'; // 97
        result = x1 <= ch1;
        System.out.println("x1 <= ch1: " + result); // true

        /*
         * !!! boolean can only be compared with boolean !!!
         */
        boolean b1 = true;
        boolean b2 = false;

        result = b1 == b2;
        System.out.println("b1 == b2: " + result); // false
//		result = b1 == x1; // compiler error ! please compare boolean with boolean

    }
}
