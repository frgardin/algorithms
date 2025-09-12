package com.algorithms.leetcode;


class leetcode58  {
 
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        return ss[ss.length-1].length();
    }

}
