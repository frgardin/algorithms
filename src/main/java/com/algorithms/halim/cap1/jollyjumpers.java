package com.algorithms.halim.cap1;

import java.util.*;

public class jollyjumpers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int i = 0;
            int[] ii = new int[n];
            while (i < n) {
                ii[i] = sc.nextInt();
                i++;
            }
            i = 1;
            boolean[] bb = new boolean[n];
            while (i < n) {
                int d = Math.abs(ii[i] - ii[i - 1]);
                if (d < n) {
                    bb[d] = true;
                }
                i++;
            }
            boolean b = true;
            i = 1;
            while (i < n) {
                b &= bb[i];
                i++;
            }
            System.out.println(b ? "Jolly" : "Not jolly");
        }
    }
}
