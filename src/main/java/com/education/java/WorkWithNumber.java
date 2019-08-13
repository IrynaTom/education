package com.education.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        int[] numbers = parse(st);
       // int[] even=  Even(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( Even(numbers));
        }
    }


    public static int[] parse(String string) {
        String[] splited = string.trim().split("\\s+");
        int[] numbers = new int[splited.length];
        for (int i = 0; i < splited.length; i++) {
            numbers[i] = Integer.parseInt(splited[i]);
        }
        return numbers;
    }

    public static ArrayList<Integer> Even(int[] numbers) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                even.add(i);
            }
            System.out.println(even[i]);
        }
        return even;
    }

}
