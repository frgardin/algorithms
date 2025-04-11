package leetcode.old;

import java.util.HashMap;

public class leetcode169 {

    public static int majorityElement(int[] nums) {
        int t = nums.length / 2;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
            if (m.get(num) > t) {
                return num;
            }
        }
        return 0;
    }

    public static int majorityElementMooreVoting(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,3,3};
        System.out.println(majorityElementMooreVoting(nums));
    }
}
