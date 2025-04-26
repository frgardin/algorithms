package arrays.holczer.balazs.exercises;

import java.util.Arrays;

public class AnagramExercise {

    public static boolean isAnagram(char[] s1, char[] s2) {
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        String s1 = "restful";
        String s2= "fluster";
        System.out.println(isAnagram(s1.toCharArray(),s2.toCharArray()));
    }
}
