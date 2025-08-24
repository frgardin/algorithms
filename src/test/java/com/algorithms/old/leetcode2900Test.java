package com.algorithms.old;

import com.algorithms.leetcode.leetcode2900;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode2900Test {

    @Test
    void test1() {
        //given
        String[] words = new String[]{"d", "g"};
        int[] groups = new int[]{0,1};

        //when
        List<String> longestSubsequence = leetcode2900.getLongestSubsequence(words, groups);

        //then
        assertIterableEquals(List.of("d", "g"), longestSubsequence);
    }

    @Test
    void test2() {
        //given
        String[] words = new String[]{"lr","h"};
        int[] groups = new int[]{0,0};

        //when
        List<String> longestSubsequence = leetcode2900.getLongestSubsequence(words, groups);

        //then
        assertIterableEquals(List.of("lr"), longestSubsequence);
    }

    @Test
    void test3() {
        //given
        String[] words = new String[]{"o","cfy","en"};
        int[] groups = new int[]{1,0,0};

        //when
        List<String> longestSubsequence = leetcode2900.getLongestSubsequence(words, groups);

        //then
        assertIterableEquals(List.of("o","cfy"), longestSubsequence);
    }

    @Test
    void test4() {
        //given
        String[] words = new String[]{"h","vv","kp"};
        int[] groups = new int[]{0,1,0};

        //when
        List<String> longestSubsequence = leetcode2900.getLongestSubsequence(words, groups);

        //then
        assertIterableEquals(List.of("h","vv","kp"), longestSubsequence);
    }

}