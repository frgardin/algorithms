package com.algorithms.leetcode;


class leetcode58  {
 
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        return ss[ss.length-1].length();
    }

    public int lengthOfLastWord2(String s) {
        int c = 0;
        int i = s.length()-2;

        if (s.charAt(i+1) != ' ') c++;


        while (i >=0) {
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
                return c;
            } 

            if (s.charAt(i) != ' ') c++;

            i--;
        }
        return c;
    }

}
