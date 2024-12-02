package com.perscholas.java.array;

import java.util.Arrays;

public class IntegerArrayTask6 {

    public void assignArrayValues() {

        //Declaration, initialization
        int[] integerArray = new int[5];


        //Assign array values
        for (int i = 0; i < integerArray.length; i++) {

            integerArray[i] = 2 * i;
        }

        //Print array values
        System.out.println("Task6");
        System.out.println("The array's values are: " + Arrays.toString(integerArray));
    }
}
