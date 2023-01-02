package com.ebru.variable;

public class Identifier {

    /**
     * Names can contain letters, digits, underscores, and dollar signs
     * Names must begin with a letter
     * Names should start with a lowercase letter and it cannot contain whitespace
     * Names can also begin with $ and _ (but we will not use it in this tutorial)
     * Names are case sensitive ("myVar" and "myvar" are different variables)
     * Reserved words (like Java keywords, such as int or boolean) cannot be used as names
     */
    public static void main(String[] args){
//		int void = 12; // Compiler Error: void is a Java keyword.

        int aBcD = 12;
        int äÜöß = 12;
        int 全全 = 12;

//		int 12abc; // Compiler Error
        int b12 = 12;

        int __ = 22; // underscore as a name ist not recommended.
        System.out.println(__);

        int $ = 12;
        int € = 12;
        int £ = 12;

//		int ?; // Compiler error
//		int #; // Compiler error
    }
}
