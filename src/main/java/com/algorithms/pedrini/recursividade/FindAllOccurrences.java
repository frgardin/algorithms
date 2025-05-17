package com.algorithms.pedrini.recursividade;

import java.util.LinkedList;
import java.util.List;

public class FindAllOccurrences {

    public static List<Integer> findAllOccurrences(Integer k, List<Integer> l) {
        return findBasedOnConstant(k, 0, l, new LinkedList<>());
    }

    private static List<Integer> findBasedOnConstant(Integer k, int i, List<Integer> l, List<Integer> lt) {
        if (l.size() - 1 == i) return lt;
        if (l.get(i).equals(k))
            lt.add(i);
        return findBasedOnConstant(k, i + 1, l, lt);
    }

    public static void main(String[] args) {
        System.out.println(findAllOccurrences(3, List.of(1, 2, 5, 3, 1, 2, 3, 8, 6, 3, 6, 7, 9)));
    }
}
