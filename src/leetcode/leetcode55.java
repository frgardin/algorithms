package leetcode;

import java.util.Arrays;
import java.util.TreeSet;

public class leetcode55 {

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        boolean b = false;
        for (int j = 1; j <= nums[0]; j++) {
            b = b || canJump(Arrays.copyOfRange(nums, j, nums.length ));
        }
        return b;
    }

    public static void main(String[] args) {
//        int[] nums = {3,2,1,0,4};
        int[] nums = {2,3,1,1,4};

        System.out.println(canJump(nums));
    }
}
