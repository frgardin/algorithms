package com.algorithms.halim.cap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HelpAPHD {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/halim/cap1/file/helpaphd.txt"));

        int TC = sc.nextInt();

        while(TC-- > 0) {
            String s = sc.next();

            if (s.contains("P=NP")) {
                System.out.printf("skipped%n");
                continue;
            }

            int m = s.indexOf("+");
            int a = Integer.parseInt(s.substring(0,m));
            int b = Integer.parseInt(s.substring(m));

            System.out.printf("%d%n", a + b);
        }
    }
}
