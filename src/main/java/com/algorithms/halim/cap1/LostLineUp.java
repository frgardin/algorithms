package com.algorithms.halim.cap1;

import java.util.*;

public class LostLineUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];
        StringBuilder sb = new StringBuilder();
        ar[0] = 1;
        int i = 2;
        while (n-- > 1) {
            int a = sc.nextInt();
            ar[a + 1] = i;
            i++;
        }

        for (int v:ar) sb.append(v).append(" ");

        System.out.println(sb);
    }
}
