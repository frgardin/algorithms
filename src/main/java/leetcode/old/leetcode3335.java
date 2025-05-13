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
}
