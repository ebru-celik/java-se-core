package com.ebru.variable;

public class Literal {

    /**
     * literal is a notation that represents a fixed value in the source code.
     */
    public static void main(String [] args){
        /*
         * int-Literal
         */
        int x1 = 12; // int, decimal
        System.out.println("x1 = " + x1); // 12

        int x2 = 012; // int, octal (prefix 0)
        System.out.println("x2 = " + x2);

        int x3 = 0x12AbCd; // int, hexadecimal
        System.out.println("x3 = " + x3);

        int x4 = 0b010101; // int, binary
        System.out.println("x4 = " + x4);

        /*
         * + - and _ with Literals
         */
        int x5 = -7;
        int x6 = +7;

        int x7 = 1_000_000;
        int x8 = 1_0_00_00_0; // meaningless but compilable
//		int x9 = _100;  // compiler error: underline at the front
//		int x10 = 100_; // compiler error: underline at the end
        int x11 = 1000000;

        /*
         * long-Literal: like int-literals, only with L or l at the end
         */
        long x13 = 12_000_000_000L;
        long x14 = 1L;
        long x15 = 1l;
        /*
         * double-Literal
         */
        double x16 = 12.3;
        double x17 = 12D;
        double x18 = 12d;

        double x19 = 2e3; // scientific notation 2.0 * 10^3
        System.out.println("x19: " + x19); // 2000.0

//		int test = 2e3; // compiler error: int <- double
        double x200 = 0.0;
        double x201 = .7;  // 0.7
        double x202 = 2.;  // 2.0
        /*
         * float-Literal
         */
//		float x20 = 12.3;   // float <- double
        float x21 = 12.3F;  // float <- float
        float x22 = 12.3f;
        /*
         * char-Literale
         */
        char x23 = 'ä';
        char x24 = '\u00e4';
        /*
         * boolean-Literale
         */
        boolean x25 = true;
        boolean x26 = false;
        /*
         * String_Literal
         */
        String abc = "Abc";
        String numbers = "123456";

    }
}
