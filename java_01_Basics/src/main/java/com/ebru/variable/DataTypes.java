package com.ebru.variable;

public class DataTypes {
    public static void main(String[] args){
        int x = 5;
        int y = 3;
        int z = x + y;
        System.out.println("z = " + z);
        /*
         * primitive data types:
         */
        byte x1;		// 8 bit		-128 .. 127
        short x2;		// 16 bit
        int x3;			// 32 bit
        long x4;		// 64 bit

        float x5;		// 32 bit
        double x6;		// 64 bit

        char x7;		// 16 bit (not-negativ)

        boolean x8;		// true or false

        x4 = Long.MAX_VALUE; // long
        System.out.println("x4 = " + x4);

        x5 = Float.MAX_VALUE; // float
        System.out.println("x5 = " + x5);

        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE); // 2_147_483_647
    }
}
