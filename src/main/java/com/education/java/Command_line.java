package com.education.java;

public class Command_line {
    public static void main(String[] args) {
        System.out.println(args);
        for(int i=0; i< args.length; i++){
            System.out.print("First road");
            System.out.print(args[i]+ " ");
            System.out.print("backward road");

        }
    }
}
