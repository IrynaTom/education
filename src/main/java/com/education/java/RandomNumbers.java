package com.education.java;

import java.lang.Math;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number, please:");
        int counter = in.nextInt();
        System.out.println("With the transition to a new line:");

        for (int i = 0; i < counter; i++) {
            System.out.println(gener(counter)[i]);
        }

    }

    public static int[] gener(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        return numbers;
    }

    public static void outInLine(char symbol, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(gener(n)[i] + "%n");
        }
    }
    public static void inInLine(char symbol, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(gener(n)[i]);
        }
    }
}
