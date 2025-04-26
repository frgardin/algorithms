package cses;

import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] ca = s.toCharArray();
        int counter = 1, r = 1;
        char b = ca[0], c;

        for (int i = 1; i < ca.length; i++) {
            c = ca[i];
            if (c == b) {
                counter += 1;
                r = Math.max(counter, r);
            } else {
                counter = 1;
            }
            b = c;
        }
        System.out.println(r);
        sc.close();
    }
}