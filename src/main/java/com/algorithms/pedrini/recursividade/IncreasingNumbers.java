package com.algorithms.pedrini.recursividade;

import java.util.*;

public class IncreasingNumbers {

    private static List<Integer> increasingNumbers(int N) {
        List<Integer> l = new ArrayList<>();
        if (N == 1) {
            l.add(1);
            return l;
        }

        List<Integer> listUpdated = increasingNumbers(N - 1);
        listUpdated.add(N);
        return listUpdated;
    }

    public static void main(String[] args) {
        System.out.println(increasingNumbers(5));
    }
}