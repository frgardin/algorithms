package com.algorithms.halim.cap1;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, n;
        x = sc.nextInt();
        y = sc.nextInt();
        n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n;i++) {
            if (i % x == 0 && i % y == 0) {
                sb.append("FizzBuzz\n");
            } else if (i % x == 0) {
                sb.append("Fizz\n");
            } else if (i % y == 0) {
                sb.append("Buzz\n");
            } else {
                sb.append(i);
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}
