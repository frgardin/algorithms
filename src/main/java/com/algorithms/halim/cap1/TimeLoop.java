package com.algorithms.halim.cap1;

import java.util.Scanner;

public class TimeLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (n-- != 0) {
            System.out.printf("%d Abracadabra%n", i);
            i++;
        }
    }
}
