package com.perscholas.java.array;

public class IntegerArrayTask7 {

    public void printArrayValues() {

        //Declaration, initialization
        int[] integerArray = new int[] { 1, 2, 3, 4, 5};

        System.out.println("Task7");

        //Print all index values except for 2
        for (int i = 0; i < integerArray.length; i++) {

            if (!(i==2)) {
                System.out.print(integerArray[i] + " ");
            }
        }
    }
}