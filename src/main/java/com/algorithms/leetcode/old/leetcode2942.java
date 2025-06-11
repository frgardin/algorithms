package com.algorithms.leetcode.old;

import java.util.ArrayList;
import java.util.List;

public class leetcode2942 {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i<words.length;i++) {
            String word = words[i];

            if (word.indexOf(x) != -1) {
                l.add(i);
            }
        }

        return l;
    }

    public static void main(String[] args) {
        String[] ss = new String[]{"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(ss, x));
    }
}
