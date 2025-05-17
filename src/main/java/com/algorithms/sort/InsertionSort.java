package com.algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {5,2,1,6,4,3};
        int i,j,k;

        for (j = 0; j < a.length; j++) {
            k = a[j];
            i = j - 1;
            while (i >= 0 && a[i] > k) {
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = k;
        }

        System.out.println(Arrays.toString(a));

    }
}