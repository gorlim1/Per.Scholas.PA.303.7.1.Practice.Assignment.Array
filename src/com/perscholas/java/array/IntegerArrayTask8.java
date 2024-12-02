package com.perscholas.java.array;

import java.util.Arrays;

public class IntegerArrayTask8 {

    public void swapArrayElements() {

        //Declaration, initialization
        String[] stringArray = new String[] {"red", "green", "blue", "yellow", "white"};
        String stringArraySwapHolder;

        //Print the array
        System.out.println("Task8");
        System.out.println("The array's values are: " + Arrays.toString(stringArray));


        //Swap string array elements
        stringArraySwapHolder = stringArray[0];
        stringArray[0] = stringArray[2];
        stringArray[2] = stringArraySwapHolder;

        //Print the swapped array's values
        System.out.println("The array's values after swapping index 1 with 2 are: " + Arrays.toString(stringArray));
    }
}