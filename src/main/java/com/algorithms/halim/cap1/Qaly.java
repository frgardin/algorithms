package com.algorithms.halim.cap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Qaly {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/halim/cap1/file/qaly.txt"));
        int TC = sc.nextInt();
        double acc = 0;
        while(TC-- > 0) {
            double q = sc.nextDouble();
            double y = sc.nextDouble();
            acc += q * y;
        }
        System.out.printf("%.3f", acc);
    }
}
