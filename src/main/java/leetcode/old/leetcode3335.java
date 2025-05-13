package leetcode.old;

public class leetcode3335 {

    public static int lengthAfterTransformations(String s, int t) {
        if (t == 0) {
            return s.length();
        }
        return lengthAfterTransformations(transform(s), t - 1);
    }

    private static String transform(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'z') {
                sb.append("ab");
            } else {
                sb.append((char) (c + 1));
            }
        }

        return sb.toString();
    }
}
