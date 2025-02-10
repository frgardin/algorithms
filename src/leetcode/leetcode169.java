package leetcode;

import java.util.HashMap;

public class leetcode169 {

    public int majorityElement(int[] nums) {
        int t = nums.length / 2;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
            if (m.get(num) > t) {
                return num;
            }
        }
        return nums[0];
    }
}
