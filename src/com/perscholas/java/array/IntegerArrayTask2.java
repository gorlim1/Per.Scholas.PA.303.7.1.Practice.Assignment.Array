package com.perscholas.java.array;

public class IntegerArrayTask2 {

    public void findMiddleArrayElement() {

        //Variable declaration, initialization, and assignment
        int[] integerArray =  {13, 5, 7, 68, 2};
        int middleElement = integerArray[integerArray.length / 2];

        System.out.println("Task2");
        System.out.println("Middle element is: " + middleElement);
        System.out.println(integerArray.length);
        System.out.println(integerArray.length / 2);
    }
}