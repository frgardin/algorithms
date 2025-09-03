package com.algorithms.codechef.roadmap;

import java.util.Scanner;

public class CheckPalindrome {

    class Main {
        // Function to check if the string can be a palindrome after deleting at most
        // one character
        static boolean validPalindrome(String s) {
            // Write your code here
            int r = s.length() - 1;
            int l = 0;
            boolean life = true;

            while (l < r) {
                if (s.charAt(l) != s.charAt(r) && life) {
                    if (s.charAt(l + 1) == s.charAt(r)) {
                        life = false;
                        l++;
                    } else {
                        life = false;
                        r--;
                    }
                } else if (s.charAt(l) != s.charAt(r)) {
                    return false;
                } else {
                    r--;
                    l++;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String s = scanner.next();
            System.out.println(validPalindrome(s) ? "true" : "false");
        }
    }
}
