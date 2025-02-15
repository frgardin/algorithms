package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leetcode274 {

    public static int hindex(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>(n + 1);
        for(int i = 0; i <= n; i++) {
            m.put(i, 0);
        }
        int h = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nums[i] && j <= n ; j++) {
                m.put(j, m.get(j) + 1);
                if (m.get(j) == j && m.get(j) > h) {
                    h = j;
                }
            }
        }
        return h;
    }

    public static void main(String[] args) {
        System.out.println(hindex(new int[]{3,0,6,1,5}));
    }
}
