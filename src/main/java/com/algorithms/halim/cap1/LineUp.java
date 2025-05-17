package com.algorithms.halim.cap1;

import java.io.File;
import java.util.Scanner;

public class LineUp {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("src/halim/cap1/file/lineup.txt"));

        int t = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int c1 = s1.compareTo(s2) > 0 ? 1 : -1;
        boolean b = false;
        while (t-- > 2) {
            String s = sc.nextLine();
            int c2 = s2.compareTo(s) > 0 ? 1 : -1;

            if (c2 != c1) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.print("NEITHER");
        } else if (c1 == -1) {
            System.out.print("INCREASING");
        } else {
            System.out.print("DECREASING");
        }
    }
}