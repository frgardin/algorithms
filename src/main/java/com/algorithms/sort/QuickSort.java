package com.algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] a, int lo, int hi) {
        int t = a[lo];
        a[lo] = a[hi];
        a[hi] = t;
    }

    private static int partition(int[] a, int lo, int hi) {
        int l = lo;
        int r = lo;
        while(r < hi) {
            if (a[r] < a[l]) {
                swap(a, r, l);
                l++;
            }
            r++;
        }
        swap(a, l, hi);
        return l;
    }


    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int p = partition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p, hi);
    }


    public static void main(String[] args) {
        int[] a = {2, 8, 7, 1, 3, 5, 6, 4};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}