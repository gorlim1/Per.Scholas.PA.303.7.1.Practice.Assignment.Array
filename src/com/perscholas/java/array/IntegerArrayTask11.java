package com.perscholas.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArrayTask11 {

    public void inputFavorite() {

        //Declaration, initialization
        //ArrayList<String> stringFavoriteArrayList = new ArrayList<String>();
        int integerLikes = 0;
        String[] stringArrayLikes;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task11");

        //Get user int input
        while (integerLikes < 1 || integerLikes > 7) {

            System.out.print("Enter the amount of favorite things (from 1 to 7): ");
            while (!scanner.hasNextInt()) {

                System.out.print("Enter the amount of favorite things (from 1 to 7): ");
                scanner.next();
            }
            integerLikes = scanner.nextInt();
            scanner.nextLine();
        }

        //Get string input
        stringArrayLikes = new String[integerLikes];
        for (int i = 0; i < integerLikes; i++) {

            System.out.print("Please enter your favorite thing " + (i + 1) + ": ");
            stringArrayLikes[i] = scanner.nextLine();
        }

        //Print string array
        System.out.println();
        System.out.println("Your favorite things are:");
//        for (String stringTemp : stringArrayLikes) {
//            System.out.print(stringTemp + "\t");

        System.out.println(Arrays.toString(stringArrayLikes));



    }
}
