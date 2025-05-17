package com.algorithms.halim.cap1;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while (TC-- > 0) {
            int x = sc.nextInt();
            if (x % 2 == 0) System.out.printf("%d is even%n", x);
            else            System.out.printf("%d is odd%n", x);
        }
    }
}
