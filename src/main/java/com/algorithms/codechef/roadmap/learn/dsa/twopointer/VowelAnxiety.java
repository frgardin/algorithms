package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;
import java.util.Set;

public class VowelAnxiety {
    private static final Set<Character> VOWELS = Set.of(
            'a', 'e', 'i', 'o', 'u'
    );

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            char[] s = sc.nextLine().toCharArray();

            int r = 0;

            while (r < n) {
                if (VOWELS.contains(s[r])) {
                    for (int i = 0; i < r / 2; i++) {
                        char aux = s[i];
                        s[i] = s[r - i - 1];
                        s[r - i - 1] = aux;
                    }
                }
                r++;
            }
            System.out.println(new String(s));

        }
    }
}
