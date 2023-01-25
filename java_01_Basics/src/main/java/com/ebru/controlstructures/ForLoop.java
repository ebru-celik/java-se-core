package com.ebru.controlstructures;

public class ForLoop {
    public static void main(String[] args){
        /**
         * for( pos1 ; pos2 ; pos3 )
         *
         * pos1: initialization area
         * pos2: Execution criterion (default value is true)
         * pos3: Incrementation area
         */
        for(int i=0 ; i < 10 ; i++) {
            System.out.println(i);
        }

        // a b c
        for (int i = 0; i < 3; i++) {
            for (char ch = 'a'; ch <= 'c'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        // any number of Statement in the incremantation area
        for(int i=0, j=-7, k=22; i==6; i++, j-=20, j*=3) {
            //...
        }

        // Multiple variables of the SAME Type can be declared in the initialization area.
        for(int i=0; i<3; i++, System.out.println("interesting")) {
            System.out.println("i=" + i);
        }
//		for(int i2, long i3;;) {} // compiler error: must be of the same type
//		for(int i2, int i3;;) {} // compiler error: only one time declare the type

        // The execution criteria can use ONE expression that evaluates to ONE boolean.
        int x = 1, y = 2;
        for(; x==1 && x+3 > 7 && y-x > 5 ;) {}

//		for( ; x==1, y==2 ; ) {} // compiler error


//      for( ; ; ) ; // endless loop
//		System.out.println("end of b1"); // compiler error: unreachable code
    }
}
