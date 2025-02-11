package leetcode;

public class leetcode121 {

    //KADANE ALGORITHM
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (buy > price) {
                buy = price;
            } else if (price - buy > profit) {
                profit = price - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] p = {1, 4, 2};

        System.out.println(maxProfit(p));
    }
}
