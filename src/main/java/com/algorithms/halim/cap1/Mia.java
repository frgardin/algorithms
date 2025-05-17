package com.algorithms.halim.cap1;

import java.io.File;
import java.util.Scanner;

public class Mia {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("src/halim/cap1/file/mia.txt"));

        while (true) {
            int s0 = sc.nextInt();
            int s1 = sc.nextInt();
            int r0 = sc.nextInt();
            int r1 = sc.nextInt();
            if (
                    s0 == 0 &&
                            s1 == 0 &&
                            r0 == 0 &&
                            r1 == 0
            ) {
                break;
            }
            if (
                    (s0 == 1 && s1 == 2) ||
                            (s0 == 2 && s1 == 1)
            ) {
                if (
                        (r0 == 1 && r1 == 2) ||
                                (r0 == 2 && r1 == 1)
                ) {
                    System.out.println("Tie.");
                    continue;
                }
                System.out.println("Player 1 wins.");
                continue;
            }
            if (
                    (r0 == 1 && r1 == 2) ||
                            (r0 == 2 && r1 == 1)
            ) {
                System.out.println("Player 2 wins.");
                continue;
            }
            if (s0 == s1) {
                if (r0 == r1) {
                    if (s0 > r0) {
                        System.out.println("Player 1 wins.");
                    } else if (r0 > s0) {
                        System.out.println("Player 2 wins.");
                    } else {
                        System.out.println("Tie.");
                    }
                    continue;
                }
                System.out.println("Player 1 wins.");
                continue;
            }
            if (r0 == r1) {
                System.out.println("Player 2 wins.");
                continue;
            }

            int p1 = Math.max(s0, s1) * 10 + Math.min(s0, s1);
            int p2 = Math.max(r0, r1) * 10 + Math.min(r0, r1);

            if (p1 > p2) {
                System.out.println("Player 1 wins.");
            } else if (p1 < p2) {
                System.out.println("Player 2 wins.");
            } else {
                System.out.println("Tie.");
            }
        }
    }
}