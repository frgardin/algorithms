package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.*;

public class CodeChefStreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int addyMaxCounter = 0;
            int addyCounter = 0;
            int omMaxCounter = 0;
            int omCounter = 0;

            for (int i = 0; i  <n;i++) {
                if (a[i] != 0) {
                    omCounter++;
                } else {
                    omMaxCounter = Math.max(omMaxCounter, omCounter);
                    omCounter=0;
                }

                if (b[i] != 0) {
                    addyCounter++;
                } else {
                    addyMaxCounter = Math.max(addyMaxCounter, addyCounter);
                    addyCounter=0;
                }
            }

            omMaxCounter = Math.max(omMaxCounter, omCounter);
            addyMaxCounter = Math.max(addyMaxCounter, addyCounter);

            if (omMaxCounter > addyMaxCounter) {
                System.out.println("Om");
            } else if (omMaxCounter < addyMaxCounter) {
                System.out.println("Addy");
            } else {
                System.out.println("Draw");
            }
        }
    }
}
