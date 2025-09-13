package com.algorithms.leetcode;

public class leetcode3541 {

    public int maxFreqSum(String s) {
        byte[] count = new byte[26];
        boolean[] vowels = new boolean[26];
        for (char c : s.toCharArray()) {
            count[c-'a']++;
        }

        vowels[0]=true;
        vowels['e'-'a']=true;
        vowels['i'-'a']=true;
        vowels['o'-'a']=true;
        vowels['u'-'a']=true;
        
        int maxVowelFreq =0;
        int maxConsonantFreq = 0;

        for (int i=0;i<26;i++) {
            if (vowels[i]) {
                maxVowelFreq = Math.max(maxVowelFreq, count[i]);
            } else {
                maxConsonantFreq = Math.max(maxConsonantFreq, count[i]);
            }
        }

        return maxVowelFreq + maxConsonantFreq;
    }
}
