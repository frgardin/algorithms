package arrays.holczer.balazs.exercises;

public class IntegerInversionExercise {

    public static int reverseInteger(int n) {
        int reversed = 0;
        int remainder;
        while (n > 0) {
           remainder = n % 10;
           n = n / 10;
           reversed = reversed * 10 + remainder;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(12300004));
    }
}
