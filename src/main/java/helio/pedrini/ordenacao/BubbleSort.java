package helio.pedrini.ordenacao;

import java.util.Arrays;

public class BubbleSort {

    private static boolean compare(int x, int y) {
        return x > y;
    }

    private static void swap(int[] a, int x, int y) {
        int aux = a[x];
        a[x] = a[y];
        a[y] = aux;
    }

    public static void bubbleSort(int[] a, int n) {
        for (int times = 0; times < n; times++) {
            for (int i = 0; i < n - times - 1;i++) {
                if (compare(a[i], a[i+1])) {
                    swap(a, i, i+1);
                }
            }
        }
    }

    public static void bubbleSortRec(int [] a, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1;i++) {
            if (compare(a[i], a[i+1])) {
                swap(a, i, i+1);
            }
        }
        bubbleSortRec(a, n - 1);
    }

    public static void bubbleSortRec2(int [] a, int n, int i) {
        if (n == 1) {
            return;
        }
        if (i == n - 1) {
            bubbleSortRec2(a, n - 1, 0);
            return;
        }
        if (compare(a[i], a[i+1])) {
            swap(a, i, i+1);
        }
        bubbleSortRec2(a, n, i + 1);
    }


    public static void bubbleSortRec3(int [] a, int n, int i, int times) {
        if (times == n) {
            return;
        }
        if (i == n - times - 1) {
            bubbleSortRec3(a, n, 0, times + 1);
            return;
        }
        if (compare(a[i], a[i+1])) {
            swap(a, i, i+1);
        }
        bubbleSortRec3(a, n, i + 1, times);
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 2,1};
        bubbleSortRec3(a, 5, 0 , 0);
        System.out.println(Arrays.toString(a));
    }
}
