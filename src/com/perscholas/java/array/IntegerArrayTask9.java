package com.perscholas.java.array;

import java.util.Arrays;

public class IntegerArrayTask9 {

    public void sortArray() {

        int[] integerArray = new int[] {4, 2, 9, 13, 1, 0};


        //Print array
        System.out.println("Task9");
        System.out.println("The original array's values are: " + Arrays.toString(integerArray));


        //Sort and print array
        Arrays.sort(integerArray);
        System.out.println("The sorted array's values are: " + Arrays.toString(integerArray));
        System.out.println("The smallest number is: " + integerArray[0]);
        System.out.println("The largest number is: " + integerArray[integerArray.length - 1]);
    }
}