package com.algorithms.codeforces;

import java.util.*;


public class BobrittoBandito {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int TC = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        while (TC-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ll = 0;
            int rl = 0;
            int d = 1;
            boolean wasLeft = false;
            while(ll > l && rl < r && d <= m) {
                if (!wasLeft) {
                    ll--;
                    wasLeft = true;
                } else {
                    rl++;
                    wasLeft = false;
                }
                d++;
            }

            while(ll > l && d <= m) {
                ll--;
                d++;
            }

            while(rl < r && d <= m) {
                rl++;
                d++;
            }

            sb.append(ll);
            sb.append(' ');
            sb.append(rl);
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
