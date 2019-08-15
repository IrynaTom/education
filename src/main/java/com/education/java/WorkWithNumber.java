package com.education.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithNumber {

    static ArrayList<Integer> luckyNumber = new ArrayList<Integer>() {{
        add(1);
        add(3);
        add(7);
        add(9);
        add(13);
    }};


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        int[] numbers = parse(st);
        System.out.println("Even numbers:" + even(numbers));
        System.out.println("Odd numbers:" + odd(numbers));
        System.out.println("divideThreeNine numbers:" + divideThreeNine(numbers));
        System.out.println("divideFiveSeven numbers:" + divideFiveSeven(numbers));
        System.out.println("Min number:" + min(numbers));
        System.out.println("Max number:" + max(numbers));
        System.out.println("halfSum numbers:" + halfSum(numbers));
        System.out.println("Lucky numbers:" + luckyNum(numbers));
        System.out.println("Lucky2 numbers:" + luckyNum2(numbers));

    }


    public static int[] parse(String string) {
        String[] splited = string.trim().split("\\s+");
        int[] numbers = new int[splited.length];
        for (int i = 0; i < splited.length; i++) {
            numbers[i] = Integer.parseInt(splited[i]);
        }
        return numbers;
    }

    public static ArrayList<Integer> even(int[] numbers) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even.add(numbers[i]);
            }
        }
        return even;
    }

    public static ArrayList<Integer> odd(int[] numbers) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd.add(numbers[i]);
            }
        }
        return odd;
    }

    public static ArrayList<Integer> divideThreeNine(int[] numbers) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 || numbers[i] % 9 == 0) {
                array.add(numbers[i]);
            }
        }
        return array;
    }

    public static ArrayList<Integer> divideFiveSeven(int[] numbers) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] % 7 == 0) {
                array.add(numbers[i]);
            }
        }
        return array;
    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static ArrayList<Integer> halfSum(int[] numbers) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] == (numbers[i - 1] + numbers[i + 1]) / 2 && (numbers[i - 1] + numbers[i + 1]) % 2 == 0) {
                array.add(numbers[i]);
            }
        }
        return array;
    }

    public static ArrayList<Integer> luckyNum(int[] numbers) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
           if(luckyNumber.contains(numbers[i])){
               array.add(numbers[i]);
            }
        }
        return array;
    }


    public static ArrayList<Integer> luckyNum2(int[] numbers) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
          for(int j=0;j<luckyNumber.size(); j++){
              if(numbers[i]==luckyNumber.get(j)){
                  array.add(numbers[i]);
              }
          }
            }
        return array;
    }
}
