package com.education.java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String name = in.next();
        System.out.println("Hello " + name +"! "+ "Welcome");


    }
}