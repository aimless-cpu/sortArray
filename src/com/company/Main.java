package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 6 ints:");

        Integer[] userInput = new Integer[6];

        for (int i=0; i<userInput.length;i++) {
            userInput[i] =sc.nextInt();

        }

        List<Integer> sort = Arrays.asList(userInput);

        Collections.sort(sort);
        System.out.println(sort);


	// write your code here
    }
}
