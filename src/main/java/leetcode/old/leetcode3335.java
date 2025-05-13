package leetcode.old;

public class leetcode3335 {

    public static int lengthAfterTransformations(String s, int t) {
        int c = 0;
        int i = 0;
        while(i < s.length()) {
            c += evaluate(s.charAt(i), t);
            i++;
        }
        return c;
    }

    private static int evaluate(char c, int t) {
        if ('z' - c > t) {
            return 1;
        }
        return evaluate('a', t - 'z' + c) + evaluate('b', t - 'z' + c);
    }

    class AnswerSolution {
        private final int mod = 1_000_000_007;
        public int lengthAfterTransformations(String s, int t) {
            int[] dp = new int[t + 26];
            for (int i = 0; i < 26; i++)
                dp[i] = 1;
            for (int i = 26; i < t + 26; i++)
                dp[i] = (dp[i - 26] + dp[i - 25]) % mod;

            int ans = 0;
            for (char ch : s.toCharArray())
                ans = (ans + dp[ch - 'a' + t]) % mod;
            return ans;
        }
    }
}
