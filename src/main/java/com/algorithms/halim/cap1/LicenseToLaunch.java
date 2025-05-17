package com.algorithms.halim.cap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LicenseToLaunch {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/halim/cap1/file/licensetolaunch.txt"));
        int d = sc.nextInt();
        long min = 10_000_000_001L;
        int index = 0;
        int minIndex = 0;
        while(d-- > 0) {
            long i = sc.nextLong();
            long newMin = Math.min(min, i);
            if (newMin < min) {
                min = newMin;
                minIndex = index;
            }
            index++;
        }
        System.out.print(minIndex);
    }
}
