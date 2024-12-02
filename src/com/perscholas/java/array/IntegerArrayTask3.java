package com.perscholas.java.array;

import java.util.Arrays;

public class IntegerArrayTask3 {


    public void cloneStringArray() {

        //Variable declaration, initialization
        String[] stringArray = new String[] {"red", "green", "blue", "yellow"};
        String[] clonedStringArray;


        //Print array length
        System.out.println("Task3");
        System.out.println("The array's length is: " + stringArray.length);

        //Close the array
        clonedStringArray = stringArray.clone();


        //Find if the original and cloned arrays have the same values
        if (Arrays.toString(stringArray).equals(Arrays.toString(clonedStringArray))) {

            System.out.println("The array's contents are: " + Arrays.toString(stringArray));
            System.out.println("The cloned array's contents are: " + Arrays.toString(clonedStringArray));

        } else {

            System.out.println("The array and the cloned array don't have the same values.");
            System.out.println("The array's contents are: " + Arrays.toString(stringArray));
            System.out.println("The cloned array's contents are: " + Arrays.toString(clonedStringArray));
        }
    }
}