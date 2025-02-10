package leetcode;

import java.util.Arrays;

public class leetcode80 {

    public static int removeDuplicates(int[] nums) {
        int c = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 1] == nums[i - 2] && nums[i] != nums[i - 1] && nums[i] != nums[i - 2]) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
