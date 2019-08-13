package com.education.java;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        String password = "Iryna";
        Scanner in = new Scanner(System.in);
        String pass = in.next();
        boolean res = password.equals(pass);
        if (res == true) {
            System.out.println("Paasword is correct");
        } else {
            System.out.println("Paasword is incorrect");
        }
    }
}

