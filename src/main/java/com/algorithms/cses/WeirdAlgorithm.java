package com.algorithms.cses;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.printf("%d ", n);
        while (n != 1){
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            System.out.printf("%d ", n);
        }
        sc.close();
    }
}
