package org.example;

import java.util.Scanner;

public class Main {
    public static int faktorijel(int broj){
        int f = 1;
        for(int i = 2; i < broj; i++)
            f = f * i;
        return f;
    }
    public static double Sinus(double x){
        double sin = 0, y = x + Math.PI/180;
        for(int i = 0; i< 10; i++){
            int fact= 1;
                    for(int j = 2; j < 2*i - 1; i++)
                        fact *= j;
                    sin += Math.pow(-1.0, i)*Math.pow(y, 2*i +1)/ fact;
        }
        return sin;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite x: ");
        double x = ulaz.nextDouble();

        System.out.println("sin(x) = " + Math.sin(x));
        System.out.println("sinus(x) = " + Sinus(x));

    }
}