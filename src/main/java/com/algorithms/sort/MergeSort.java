package com.algorithms.sort;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] a, int lo, int mid, int hi) {
        int left = lo;
        int right = mid + 1;
        int[] temp = new int[a.length];
        int tempIndex = 0;

        while (left <= mid && right <= hi) {
            if (a[left] < a[right]) {
                temp[tempIndex] = a[left];
                left++;
            } else {
                temp[tempIndex] = a[right];
                right++;
            }
            tempIndex++;
        }

        while (left <= mid) {
            temp[tempIndex] = a[left];
            left++;
            tempIndex++;
        }

        while (right <= hi) {
            temp[tempIndex] = a[right];
            right++;
            tempIndex++;
        }

        tempIndex = 0;

        for (int i = lo; i <= hi;i++) {
            a[i] = temp[tempIndex];
            tempIndex++;
        }
    }

    public static void sort(int[] a, int lo, int hi) {
        if (lo >= hi)
            return;
        int mid = (lo + hi) / 2;
        sort(a, mid + 1, hi);
        sort(a, lo, mid);
        merge(a, lo, mid, hi);
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 2, 1};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
