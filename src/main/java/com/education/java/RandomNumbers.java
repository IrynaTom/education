package com.education.java;

import java.lang.Math;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number, please:");
        int counter = in.nextInt();
        int[] inLine = new int[counter];
        int[] values = gener(counter);

        printValues(values, ' ');
       // printValues(gener(counter), '\n');

    }

    public static int[] gener(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        return numbers;
    }

    public static void printValues(int[] values, char separator){
        for (int i = 0; i < values.length; i++) {
            System.out.print(gener(values.length)[i] + separator);
        }
    }

}
