package leetcode;

import java.util.Arrays;

public class leetcode88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int i = 0, j = 0;
        boolean a = true;
        boolean b = true;

        int[] temp = new int[m];

        for (int k = 0; k < m; k++) {
            temp[k] = nums1[k];
        }

        for (int k = 0; k < m + n; k++) {
            if (!a ||(b && temp[i] > nums2[j])) {
                nums1[k] = nums2[j];
                if (j == n - 1) {
                    b = false;
                } else {
                    j++;
                }
            } else {
                nums1[k] = temp[i];
                if (i == m - 1) {
                    a = false;
                } else {
                    i++;
                }
            }
        }
    }

    public static void anotherMerge(int[] nums1, int m, int[] nums2, int n) {
        int nidx = n - 1;
        int midx = m - 1;
        int right = m + n - 1;

        while(nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int [] nums2 = {2, 5, 6};
        int m = nums1.length - nums2.length;
        int n = nums2.length;

        anotherMerge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
