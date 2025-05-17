package com.algorithms.halim.cap1;

import java.util.HashMap;
import java.util.Scanner;

public class Acm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> cim = new HashMap<>();
        int q = 0;
        int p = 0;
        while (true) {
            String s = sc.nextLine();
            if (s.contains("-1")) {
                System.out.printf("%d %d", q, p);
                break;
            }
            String[] split = s.split(" ");
            char c = split[1].charAt(0);
            int i = Integer.parseInt(split[0]);
            boolean right = split[2].contains("right");
            Integer e = cim.getOrDefault(c, 0);
            if (right) {
                p += e * 20 + i;
                q++;
            } else {
                cim.put(c, e + 1);
            }
        }
    }
}