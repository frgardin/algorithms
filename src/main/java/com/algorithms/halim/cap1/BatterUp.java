package com.algorithms.halim.cap1;

import java.util.Scanner;

public class BatterUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int t = (int) n;
        double acc = 0;
        while(t-- > 0) {
            double a = sc.nextDouble();
            if (a == -1) {
                n--;
                continue;
            }
            acc += a;
        }

        System.out.printf("%.8f", acc / n);
    }
}
