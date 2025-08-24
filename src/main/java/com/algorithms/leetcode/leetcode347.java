package com.algorithms.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode347 {

    static class Frequency implements Comparable<Frequency> {

        int id;
        int freq;

        Frequency(int i) {
            this.id = i;
            this.freq = 1;
        }

        @Override
        public int compareTo(Frequency o) {
            return this.freq - o.freq;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Frequency> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                m.get(nums[i]).freq++;
            } else {
                m.put(nums[i], new Frequency(nums[i]));
            }
        }

        Object[] values = m.values().toArray();

        for (int times = 0; times < k; times++) {
            for (int i = 0; i < values.length - 1; i++) {
                Frequency f1 = (Frequency) values[i];
                Frequency f2 = (Frequency) values[i + 1];
                if (f1.compareTo(f2) > 0) {
                    swap(values, i, i + 1);
                }
            }
        }

        int[] ks = new int[k];
        int j = 0;
        for (int i = values.length - 1; i > values.length - 1 - k; i--) {
            ks[j] = ((Frequency) values[i]).id;
            j++;
        }

        return ks;
    }

    private static void swap(Object[] values, int i, int i1) {
        Object aux = values[i];
        values[i] = values[i1];
        values[i1] = aux;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(ints, k)));
    }
}
