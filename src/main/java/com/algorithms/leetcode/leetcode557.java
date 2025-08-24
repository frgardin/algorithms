package com.algorithms.leetcode;

import java.util.Arrays;

public class leetcode557 {

    private static final String EMPTY_SPACE_STRING = " ";
    private static final Character EMPTY_SPACE_CHAR = ' ';


    public static String reverseWords(String s) {
        return Arrays.stream(s.split(EMPTY_SPACE_STRING))
                .map(StringBuilder::new)
                .map(s2 -> s2.append(EMPTY_SPACE_STRING))
                .map(StringBuilder::reverse)
                .reduce(new StringBuilder(), StringBuilder::append)
                .toString()
                .trim();
    }

    public static String reverseWords2(String s) {
        String[] split = s.split(EMPTY_SPACE_STRING);
        StringBuilder sb = new StringBuilder();
        for (String string : split) {
            sb.append(new StringBuilder(string).reverse()).append(EMPTY_SPACE_STRING);
        }
        return sb.toString().trim();
    }

    public static String reverseWords3(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (charArray[i] == EMPTY_SPACE_CHAR) {
                for (int j = i - 1; j >= 0; j--) {
                    if (charArray[j] == EMPTY_SPACE_CHAR) {
                        break;
                    }
                    reversed.append(charArray[j]);
                }
                reversed.append(EMPTY_SPACE_STRING);
            }
        }
        for (int j = n - 1; j >= 0; j--) {
            if (charArray[j] == EMPTY_SPACE_CHAR) {
                break;
            }
            reversed.append(charArray[j]);
        }
        return reversed.toString();
    }

    public static String reverseWords4(String s) {
        int n = s.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == EMPTY_SPACE_CHAR) {
                for (int j = i - 1; j >= 0; j--) {
                    if (s.charAt(j) == EMPTY_SPACE_CHAR) {
                        break;
                    }
                    reversed.append(s.charAt(j));
                }
                reversed.append(EMPTY_SPACE_STRING);
            }
        }
        for (int j = n - 1; j >= 0; j--) {
            if (s.charAt(j) == EMPTY_SPACE_CHAR) {
                break;
            }
            reversed.append(s.charAt(j));
        }
        return reversed.toString();
    }

    public static String reverseWords5(String s) {
        char[] chars = s.toCharArray();
        int j = 0;
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            if (chars[i] == EMPTY_SPACE_CHAR) {
                reverseOneWord(j, i, chars);
                j = i + 1;
            }
        }
        reverseOneWord(j, n, chars);
        return new String(chars);
    }

    private static void reverseOneWord(int j, int n, char[] chars) {
        for (int k = j; k < (n - j) / 2 + j; k++) {
            char c = chars[k];
            chars[k] = chars[n - 1 - k + j];
            chars[n - 1 - k + j] = c;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords2("Let's take LeetCode contest"));
        System.out.println(reverseWords3("Let's take LeetCode contest"));
        System.out.println(reverseWords4("Let's take LeetCode contest"));
        System.out.println(reverseWords5("Let's take LeetCode contest"));
    }
}
