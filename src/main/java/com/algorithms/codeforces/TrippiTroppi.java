package com.algorithms.codeforces;

import java.util.Scanner;

public class TrippiTroppi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        while (TC-- > 0) {
            String s = sc.nextLine();
            char[] charArray = s.toCharArray();
            sb.append(charArray[0]);

            int i = 0;
            boolean next = false;
            while (i < charArray.length) {
                if (charArray[i] == ' ') {
                    next = true;
                } else if (next) {
                    sb.append(charArray[i]);
                    next = false;
                }
                i++;
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
