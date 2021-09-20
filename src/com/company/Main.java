package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];;

        for (int i = 0; i < 5; i++) {
            System.out.println("Type number " + (i+1) + ": \n");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum/numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
