package leetcode.old;

public class leetcode1550 {

    // link: https://leetcode.com/problems/three-consecutive-odds/
    public static boolean threeConsecutiveOdds(int[] arr) {
        int c = 0;
        int i = 0;
        while (c != 3 && i < arr.length) {
            if ((arr[i] & 1) == 1) {
                c++;
            } else {
                c = 0;
            }
            i++;
        }
        return c == 3;
    }
}
