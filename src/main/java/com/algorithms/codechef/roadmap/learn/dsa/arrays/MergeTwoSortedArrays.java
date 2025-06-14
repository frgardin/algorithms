package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a[] = new int[n1];
        int b[] = new int[n2];


        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();


        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                sb.append(a[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(b[j]);
                sb.append(' ');
                j++;
            }
        }

        while (i < n1) {
            sb.append(a[i]);
            sb.append(' ');
            i++;
        }

        while (j < n2) {
            sb.append(b[j]);
            sb.append(' ');
            j++;
        }

        System.out.println(sb);
    }
}
