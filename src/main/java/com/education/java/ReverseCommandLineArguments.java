package com.education.java;

public class ReverseCommandLineArguments {
    public static void main(String[] args) {
        System.out.println(args);
        for(int i=0; i< args.length; i++){
            System.out.print(args[i]+ " ");
        }
        System.out.println(" ");
        for(int i=args.length-1; i>= 0; i--){
            System.out.print(args[i]+ " ");
        }
    }
}
