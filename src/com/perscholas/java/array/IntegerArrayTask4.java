package com.perscholas.java.array;

public class IntegerArrayTask4 {

    public void arrayExceptionTesting() {

        //Variable declaration, initialization
        int[] integerArray = new int[] {1, 2, 3, 4, 5};


        //Print index values
        System.out.println("Task4");
        System.out.println("The values of the array's index 0 and index 4 are: "
                + integerArray[0] + ", " + integerArray[4]);


        //Print the array element of the array's length value, returns an out-of-bounds exception
        //System.out.println("The values of the array's index 0 and index 4 are: " +
        // integerArray[integerArray.length]);
        System.out.println("This code returns an out-of-bounds exception:");
        System.out.println("integerArray[integerArray.length]");
        System.out.println();


        //Assign a value to index = array length, returns an out-of-bounds exception
        //integerArray[5] = 6;
        System.out.println("This code also returns an out-of-bounds exception:");
        System.out.println("integerArray[5] = 6");
    }
}