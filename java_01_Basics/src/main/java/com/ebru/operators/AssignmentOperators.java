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

    }

}
