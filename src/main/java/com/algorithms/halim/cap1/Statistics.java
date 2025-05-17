package com.algorithms.halim.cap1;

import java.io.File;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("src/halim/cap1/file/statistics.txt"));
        int counter = 1;
        while(sc.hasNext()) {
            int k = sc.nextInt();
            int max = -1_000_001;
            int min = 1_000_001;
            while(k-- > 0) {
                int i = sc.nextInt();
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
            System.out.printf("Case %d: %d %d %d%n", counter, min, max, max - min);
            counter++;
        }
    }
}
