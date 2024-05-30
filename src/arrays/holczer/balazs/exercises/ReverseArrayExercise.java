package arrays.holczer.balazs.exercises;

/*
Reversing an array in-place exercise

In this exercise, you have to reverse a T[] array in O(N) linear time complexity and we want the algorithm to be in-place as well - so the algorithm can not use additional memory!

For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]

Good luck!
 */


import java.util.Arrays;

public class ReverseArrayExercise {

    public static int[] solve(int[] nums) {
        int size = nums.length;

        for (int i = 0; i < size / 2; i++) {
            swap(nums, i, size - 1 - i);
        }

        return nums;
    }

    private static void swap(int[] nums, int index1, int index2) {
        int a = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = a;
    }

    private static int[] createRangeArray(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = createRangeArray(10);
        int[] b = a;
        System.out.println(Arrays.toString(a));
        solve(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
