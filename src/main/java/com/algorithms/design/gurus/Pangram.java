package com.algorithms.design.gurus;

import java.util.*;

public class Pangram {
  public boolean checkIfPangram(String sentence) {
    Set<Character> s = new HashSet<>();
    Set<Character> a = new HashSet<>();

    for (int i = 0; i < 26; i++) {
      a.add((char) ('z' - i));
    }

    for (char c : sentence.toLowerCase().toCharArray()) {
      if (s.contains(c)) {
        continue;
      }
      if (a.contains(c)) {
        s.add(c);
      }
    }

    return s.size() == 26;
  }

  public static void main(String[] args) {
    Pangram p = new Pangram();
    System.out.println(p.checkIfPangram("Cwm fjord bank glyphs vext quiz"));
  }
}
