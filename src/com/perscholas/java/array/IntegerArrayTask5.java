package com.perscholas.java.array;

import java.util.Arrays;

public class IntegerArrayTask5 {

    public void assignArrayValues() {

        //Declaration, initialization
        int[] integerArray = new int[5];


        //Assign values to the array
        for (int i = 0; i < integerArray.length; i++) {

            integerArray[i] = i;
        }

        //Print the array's values
        System.out.println("Task5");
        System.out.println("The array's values are: " + Arrays.toString(integerArray));
    }
}