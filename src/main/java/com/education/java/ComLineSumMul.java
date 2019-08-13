package com.education.java;

public class ComLineSumMul {
    public static void main(String[] args) {
        int Sum= 0;
        int Mul= 1;

for (int i=0; i< args.length; i++){

    Sum+=Integer.parseInt(args[i]);
    Mul*=Integer.parseInt(args[i]);
}
        System.out.println("Summa: "+Sum);
        System.out.println("Mul: "+Mul);
}
}
