package com.algorithms.halim.cap2;

import java.util.*;

public class baloni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 0;
        int c;
        int[] ii = new int[n];

        while(i < n) {
            ii[i] = sc.nextInt();
            i++;
        }

        i = 1;
        c = 1;
        ArrayList<Integer> s = new ArrayList<>();
        s.add(ii[0] - 1);

        while (i < n) {
            if (!s.contains(ii[i])) {
                c++;
            } else {
                s.remove(s.indexOf(ii[i]));
            }
            s.add(ii[i] - 1);
            i++;
        }
        System.out.println(c);
    }
}