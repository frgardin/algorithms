package cormen.sort;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] a, int k, int n) {
        int m = (k + n) / 2;
        int i = k;
        int j = m;
        int[] t = new int[a.length];
        int l = 0;
        while(i <= m && j <= n) {
            if (a[i] < a[j]) {
                t[l++] = a[i++];
            } else {
                t[l++] = a[j++];
            }
        }

        while (i <= m) {
            t[l++] = a[i++];
        }

        while(j <= n) {
            t[l++] = a[j++];
        }

        int p = 0;
        for(int x = k; x <= n;x++) {
            a[x] = t[p++];
        }
    }

    private static void sort(int[] a, int k, int n) {
        if (k >= n) {
            return;
        }
        int mid = (k + n) / 2;
        sort(a, mid + 1, n);
        sort(a, k, mid);
        merge(a, k, n);
    }

    public static void main(String[] args) {
        int[]a = new int[]{5, 4, 3, 2, 1};
        sort(a, 0, a.length- 1);
        System.out.println(Arrays.toString(a));
    }
}
