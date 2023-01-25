package com.ebru.controlstructures;

public class DoWhileLoop {
    public static void main(String[] args){

        // while loop
        System.out.println("*** while ***");
        int x = 3;
        while (x > 0) {
            System.out.println(x--);
        }
        //=====  do-while loop
        System.out.println("*** do-while ***");
        int y = 0;
        do {
            System.out.println(y++);
        } while(y < 3) ; // !!comma!!

        // ==== break -continue
        /*
         * The break statement jumps out of the loop ( ends the loop)
         *
         * The continue statement breaks one iteration (in the loop),
         * if a specified condition occurs, and continues with the next iteration in the loop.
         */
        System.out.println("*** break - continue ***");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " "); // 0 1 2 3
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + " "); // 0 1 2 3 5 6 7 8 9
        }

    }
}
