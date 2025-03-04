package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class leetcode219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j - i <= k && j < n; j++) {
                if (nums[i] == nums[j] && j - i <= k) return true;
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - nums[map.get(nums[i])] <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }

    //HASHMAP is better according put function
    public static boolean containsNearbyDuplicate3(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - nums[map.get(nums[i])] <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }


    public boolean containsNearbyDuplicate4(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int l = 0;
        int n = nums.length;
        while (l < n) {
            if (m.containsKey(nums[l]) && Math.abs(m.get(nums[l]) - l) <= k) return true;
            m.put(nums[l], l++);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 1));
        System.out.println(containsNearbyDuplicate2(new int[]{1, 2, 3, 1, 2, 3}, 1));
        System.out.println(containsNearbyDuplicate3(new int[]{1, 2, 3, 1, 2, 3}, 1));
    }
}
