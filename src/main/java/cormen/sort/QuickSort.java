package cormen.sort;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] a,int p,  int r) {
        int t = a[p];
        a[p] = a[r];
        a[r] = t;
    }

    private static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p -1;
        for (int j = p; j <= r - 1;j++) {
            if (a[j] <= x) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, r);
        return i + 1;
    }

    public static void sort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            sort(a, p, q -1);
            sort(a, q+1, r);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 8, 7, 1, 3, 5, 6, 4};
        sort(a, 0,a.length - 1 );
        System.out.println(Arrays.toString(a));
    }
}