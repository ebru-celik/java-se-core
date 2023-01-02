package com.ebru.variable;

public class Constants {
    public static void main(String[] args) {
        int var = 12;
        System.out.println("1. var: " + var); // 12
        var = 333;
        System.out.println("2. var: " + var); // 333

        final int konst = 12;
        // konst = 333; // compiler error: final
    }
}
