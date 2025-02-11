package leetcode;

public class leetcode121 {
    public static int maxProfit(int[] prices) {
        int maxDiff = 0;
        int maxRight = 0;
        int minLeft = 100_000;
        int n = prices.length;
        for (int i = 0; i < n / 2; i++) {
            int right = prices[n - 1 - i];
            int left = prices[i];
            int currentDiff = right - left;
            if (right > maxRight) {
                maxRight = right;
            }
            if (left < minLeft) {
                minLeft = left;
            }
            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
            }
        }
        if (n % 2 != 0) {
            int middle = prices[n / 2];
            if (maxDiff < (middle - minLeft)) {
                return middle - minLeft;
            }
            if (maxDiff < (maxRight - middle)) {
                return maxRight - middle;
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        int[] p = {1,4,2};

        System.out.println(maxProfit(p));
    }
}
