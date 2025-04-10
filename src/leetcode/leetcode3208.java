package leetcode;

public class leetcode3208 {

    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int i = 0;
        int j = 1;
        int c = 0;
        while (j < colors.length) {
            if (colors[j] != colors[j - 1]) {
                j++;
                continue;
            }
            if ((j - i) >= (k - 1)) {
                c += j - i - k + 2;
            }
            i = j + 1;
            j += 2;
        }
        if (j == colors.length) {
            j -= 1;
            if ((j - i) >= (k - 1)) {
                c += j - i - k + 2;
            }
            if (colors[j] != colors[0]) {
                for (int l = 0, r = 1; r < k; l++, r++) {
                    if (colors[l] == colors[r]) {
                        return c;
                    }
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{0,1,0,0,1,0,1}, 6));
    }
}
