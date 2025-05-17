package com.algorithms.halim.cap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Eligibility {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/halim/cap1/file/eligibility.txt"));

        int TC = sc.nextInt();

        while(TC-- > 0) {

            String n = sc.next();
            String d1 = sc.next();
            String d2 = sc.next();
            int c = sc.nextInt();

            int y1 = Integer.parseInt(d1.substring(0, 4));
            int y2 = Integer.parseInt(d2.substring(0, 4));

            if (y1 >= 2010 || y2 >= 1991)  System.out.printf("%s eligible%n", n);
            else if(c > 40)                System.out.printf("%s ineligible%n", n);
            else                           System.out.printf("%s coach petitions%n", n);
        }
    }
}
