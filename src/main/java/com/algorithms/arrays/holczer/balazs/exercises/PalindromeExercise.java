package com.algorithms.arrays.holczer.balazs.exercises;

public class PalindromeExercise {

    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int size = c.length;
        boolean theAnswer = true;
        while (i < size / 2) {
            char c1 = c[i];
            char c2 = c[size - 1 - i];
            if (c1 != c2) {
                theAnswer = false;
                break;
            }
            i++;
        }
        return theAnswer;
    }

    public static void main(String[] args) {
        String s = "radar";
        System.out.println(isPalindrome(s));
    }
}
