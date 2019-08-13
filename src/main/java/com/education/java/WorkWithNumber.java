package com.education.java;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        while(in.hasNextInt()){
            numbers.add(in.nextInt());
        }
        Integer [] nums = numbers.toArray(new Integer[0]);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }


}
