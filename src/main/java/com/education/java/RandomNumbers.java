package com.education.java;

import java.lang.Math;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number, please:");
        int counter = in.nextInt();
        System.out.println("With the transition to a new line:");

    for (int i= 0; i< counter; i++) {
        int number = (int) (Math.random() * 10);
               System.out.println(number);
        System.out.print(number);

    }}

}
