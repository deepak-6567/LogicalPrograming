package com.rc.numberProblems;
import java.util.*;

public class FibonacciWithInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting range");
        int start = sc.nextInt();

        System.out.println("Enter the ending range");
        int end = sc.nextInt();

        int a = 0;
        int b = 1;

        while (a <= end) {
            if (a >= start) {
                System.out.print(a + " ");
            }

            int c = a + b;
            a = b;
            b = c;
        }
    }
}