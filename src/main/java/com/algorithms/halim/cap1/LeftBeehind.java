package com.algorithms.halim.cap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LeftBeehind {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/halim/cap1/file/leftbeehind.txt"));

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a == 0) && (b == 0)) break;
            if (a + b == 13) {
                System.out.printf("Never speak again.%n");
                continue;
            }
            if (a > b) {
                System.out.printf("To the convention.%n");
                continue;
            }
            if (a < b) {
                System.out.printf("Left beehind.%n");
                continue;
            }
            System.out.printf("Undecided.%n");
        }
    }
}
