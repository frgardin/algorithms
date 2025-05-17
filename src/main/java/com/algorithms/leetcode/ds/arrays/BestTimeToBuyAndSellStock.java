package com.algorithms.leetcode.ds.arrays;

public class BestTimeToBuyAndSellStock {

    public static int bestSolutionMaxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (buy > price) {
                buy = price;
                continue;
            }
            profit = Math.max(price - buy, profit);
        }
        return profit;
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int i = 0, j = 1;
        int n = prices.length;
        while (i < n - 1 && j < n) {
            int a = prices[i];
            int b = prices[j];
            if (b <= a) {
                i = j;
                j++;
                continue;
            }
            max = Math.max(b - a, max);
            j++;
        }
        return max;
    }

    public static int worstSolution(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(prices[j] - prices[i], max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9});
    }
}
