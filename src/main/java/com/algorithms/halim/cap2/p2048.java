package com.algorithms.halim.cap2;

import java.util.Scanner;


public class p2048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        int i = 0;
        int j;
        while (i < 4) {
            j = 0;
            while (j < 4) {
                a[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        int cmd = sc.nextInt();

        if (cmd == 0) {
            int l = 0;
            while (l < 4) {
                int c = 2;
                while (c >= 0) {
                    if (a[l][c + 1] == a[l][c]) {
                        a[l][c] = a[l][c] * 2;
                        a[l][c + 1] = 0;
                    } else if (a[l][c] == 0 && a[l][c+1] != 0) {
                        a[l][c] = a[l][c + 1];
                        a[l][c + 1] = 0;
                    }
                    c--;
                }
                l++;
            }

        } else if (cmd == 1) {

        } else if (cmd == 2) {

        } else {

        }
        i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < 4) {
            j =0;
            while (j < 4) {
                sb.append(a[i][j]);
                sb.append(' ');
                j++;
            }
            sb.append('\n');
            i++;
        }
        System.out.print(sb);
    }
}
