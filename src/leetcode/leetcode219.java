package leetcode;

public class leetcode219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n - 1;i++) {
            for (int j = i + 1; j - i <= k && j < n; j++) {
                if (nums[i] == nums[j] && j - i <= k) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 1));
    }
}
