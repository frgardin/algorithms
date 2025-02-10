package leetcode;

import java.util.Arrays;

public class leetcode80 {

    public static int removeDuplicates(int[] nums) {
        int c = 2;
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        for (int i = 2; i < nums.length; i++) {
            if (temp[i - 1] != temp[i - 2] || temp[i] != temp[i - 1]) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }

    public static int removeDuplicates2(int[] nums) {
        int c = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[c - 2]) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
