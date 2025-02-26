package leetcode;

import java.util.Arrays;

public class leetcode557 {

    public static String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(StringBuilder::new)
                .map(s2 -> s2.append(" "))
                .map(StringBuilder::reverse)
                .reduce(new StringBuilder(), StringBuilder::append)
                .toString()
                .trim();
    }
}
