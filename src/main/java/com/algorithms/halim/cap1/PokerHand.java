package com.algorithms.halim.cap1;

import java.util.HashMap;
import java.util.Scanner;

public class PokerHand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> m = new HashMap<>();

        m.put('A', 0);
        m.put('2', 0);
        m.put('3', 0);
        m.put('4', 0);
        m.put('5', 0);
        m.put('6', 0);
        m.put('7', 0);
        m.put('8', 0);
        m.put('9', 0);
        m.put('T', 0);
        m.put('J', 0);
        m.put('Q', 0);
        m.put('K', 0);

        char max = 'A';

        int n = 5;

        while(n-- > 0) {
            String s = sc.next();
            char c = s.charAt(0);

            m.put(c, m.get(c) + 1);

            if (m.get(max) < m.get(c)) max = c;
        }

        System.out.print(m.get(max));
    }
}
