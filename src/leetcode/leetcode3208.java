package leetcode;

public class leetcode3208 {

    //TODO: wa
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int l = 0;
        int r = 1;
        int c = 0;
        while (l < colors.length && ((l != (r + 1) % colors.length))) {
            if (colors[r] != colors[r - 1 == -1 ? colors.length - 1 : r - 1]) {
                r = (r + 1) % colors.length;
                continue;
            }
            int diff = r - l > 0 ? r - l : colors.length - 1 - r + l;
            if (diff >= k - 1) {
                c += diff - k + 2;
            }
            l = r + 1;
            r = l + 1;
        }
        r = (r + 1) % colors.length;
        if (colors[r] != colors[r - 1 == -1 ? colors.length - 1 : r - 1]) {
            c += colors.length;
        } else {
            int diff = colors.length - 1 - r + l;
            if (diff >= k - 1) {
                c = diff - k + 2;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{0,1,0,0,1,0,1}, 6));
    }
}
