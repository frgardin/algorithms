package com.algorithms.design.gurus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowels {
    
    public String reverseVowels(String s) {
    List<Integer> v = new ArrayList<>();

    Set<Character> set = new HashSet<>();
    set.add('A');
    set.add('E');
    set.add('I');
    set.add('O');
    set.add('U');
    set.add('a');
    set.add('e');
    set.add('i');
    set.add('o');
    set.add('u');

    char cs[] = s.toCharArray();
    
    for (int i = 0; i < cs.length; i++) {
      if (set.contains(cs[i])) {
        v.add(i);
      }
    }

    for (int i = 0; i < v.size()/2; i++) {
      int j = v.get(i);
      int k = v.get(v.size()-1-i);
      char c = cs[j];
      cs[j] = cs[k];
      cs[k] = c;
    }
    
    return new String(cs);
  }
}
