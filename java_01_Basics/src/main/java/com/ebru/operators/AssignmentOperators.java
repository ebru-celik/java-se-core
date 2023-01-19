package com.ebru.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        /*
        * 		+=
        * 		-=
        * 		*=
        *		/=
        *		%=
        */
        int x1 = 7;
        x1 *= 2; // x1 = (int)(x1 * 2)
        System.out.println("x1 = " + x1); // 14

        /*
         * test
        */
        byte b1 = 2;
        b1 += 5; // OK!  b1 = (byte)(b1 + 5)
        System.out.println("b1 = " + b1); // 7

        /*
        * test without assignment-with-operators(+=)
        */
        byte b2 = 2;
        //b2 = b2 + 5; // compiler error: byte <- int
        b2 = (byte)(b2 + 5);
        System.out.println("b2 = " + b2); // 7


        /*
        * &=
        * |=
        * ^=
        */
        byte v1 = 1;	// 0000 0001
        // &
        byte v2 = 2;	// 0000 0010
        // =
        // 0000 0000

        int v3 = v1 & v2;
        System.out.println( "v3: " + v3 );

        v1 &= v2; // v1 = (byte) (v1 & v2)
        System.out.println("v1: " + v1);

        /*
         * boolean is only compatible with boolean!
         * int a = true; // compiler error!
         * boolean b = 22; // compiler error!
         */

        /*
         * byte -> short -> int -> long -> float -> double
         * The order helps identify when an assignment compiles without casting.
         */

        long l1 = Long.MAX_VALUE;
        System.out.println("l1: " + l1); // 9_223_372_036_854_775_807

        float f1 = l1; // float <- long  (it works)
        System.out.println("f1: " + f1); //  9.223372E18

		//l1 = f1; // compiler error: long <- float

        byte b3 = 12; // implicit casting bei: byte <- int (with Literal)
        /*
         * char
         */
        char ch = 97;  // implicit casting: char ch = (char) 97;

//		byte v3 = ch;  // compiler error! byte <- char

//		short v4 = ch; // compiler error! short <- char

        int v5 = ch;	// int <- char
    }
}
