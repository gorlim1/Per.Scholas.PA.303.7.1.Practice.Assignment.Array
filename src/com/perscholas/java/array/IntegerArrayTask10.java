package com.perscholas.java.array;

import java.util.Arrays;

public class IntegerArrayTask10 {

    //Custom class for the mixed type array
    public class mixedTypeArray {

        int integer1;
        double double1;
        String string1;
        String string2;
        String string3;
    }

    //Create array, print object
    public void createArrayMixedTypes() {

        mixedTypeArray[] mixedArray = new mixedTypeArray[1];

        mixedArray[0] = new mixedTypeArray();
        mixedArray[0].integer1 = 1;
        mixedArray[0].double1 = 1.2;
        mixedArray[0].string1 = "Hello";
        mixedArray[0].string2 = "World";
        mixedArray[0].string3 = "Hello";

        System.out.println("Task10");
        System.out.printf("The array's elements are: %s, %s, %s, %s, %s", mixedArray[0].integer1, mixedArray[0].double1,
                mixedArray[0].string1, mixedArray[0].string2, mixedArray[0].string3);
    }
}