package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

class ChefAndSpecialDishes {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s = sc.nextLine();
            String ans = "YES";
            int l = 0, r, n = s.length(), count = 0, max = 1;

            if (n == 1) {
                System.out.println("NO");
                continue;
            }

            if (n % 2 == 0) {
                r = n / 2;
                while (r < n) {
                    if (s.charAt(l) == s.charAt(r)) {
                        r++;
                        l++;
                        continue;
                    }
                    ans = "NO";
                    break;
                }
                System.out.println(ans);
                continue;
            }
            r = n / 2;


            while (r < n) {
                if (s.charAt(l) == s.charAt(r)) {
                    l++;
                    r++;
                    continue;
                }
                if (count >= max) {
                    ans = "NO";
                    break;
                }

                r++;
                count++;
            }

            if (ans.equals("NO")) {
                r = n / 2 + 1;
                l = 0;
                ans = "YES";
                count = 0;
                while (r < n) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l++;
                        r++;
                        continue;
                    }
                    if (count >= max) {
                        ans = "NO";
                        break;
                    }

                    l++;
                    count++;
                }
            }

            System.out.println(ans);
        }
    }
}
