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


    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 2,1};
        bubbleSortRec(a, 5);
        System.out.println(Arrays.toString(a));
    }
}
