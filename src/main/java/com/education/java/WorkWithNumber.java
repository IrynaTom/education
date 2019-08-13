package com.education.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = parse(in.next());
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }


    public static int[] parse(String string) {
        String[] splited = string.split(" ");
        int[] numbers = new int[splited.length];
        for (int i = 0; i < splited.length; i++) {
            numbers[i] = Integer.parseInt(splited[i]);
        }
        return numbers;
    }
}
